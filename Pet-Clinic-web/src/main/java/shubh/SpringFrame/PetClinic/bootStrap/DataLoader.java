package shubh.SpringFrame.PetClinic.bootStrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import shubh.SpringFrame.PetClinic.model.Owner;
import shubh.SpringFrame.PetClinic.model.Pet;
import shubh.SpringFrame.PetClinic.model.PetType;
import shubh.SpringFrame.PetClinic.model.Vet;
import shubh.SpringFrame.PetClinic.services.OwnerService;
import shubh.SpringFrame.PetClinic.services.PetTypeService;
import shubh.SpringFrame.PetClinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brick Station");
        owner1.setCity("Miami");
        owner1.setTelephone("1234123412");

        Pet mikesPet = new Pet();
        mikesPet.setName("Rosco");
        mikesPet.setPetType(saveDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner1.setAddress("123 Tramp Station");
        owner1.setCity("Miami");
        owner1.setTelephone("1234123424");

        Pet fionasPet = new Pet();
        fionasPet.setName("shiro");
        fionasPet.setPetType(saveCatPetType);
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(fionasPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
