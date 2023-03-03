package shubh.SpringFrame.PetClinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import shubh.SpringFrame.PetClinic.model.Speciality;
import shubh.SpringFrame.PetClinic.model.Vet;
import shubh.SpringFrame.PetClinic.services.SpecialityService;
import shubh.SpringFrame.PetClinic.services.VetService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                Speciality savedSpeciality = specialityService.save(speciality);
                speciality.setId(savedSpeciality.getId());
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object ) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}