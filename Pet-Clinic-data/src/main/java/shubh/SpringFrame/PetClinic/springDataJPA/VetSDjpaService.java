package shubh.SpringFrame.PetClinic.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import shubh.SpringFrame.PetClinic.model.Vet;
import shubh.SpringFrame.PetClinic.repositories.VetRepository;
import shubh.SpringFrame.PetClinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDjpaService implements VetService {
    private final VetRepository vetRepository;

    public VetSDjpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
