package shubh.SpringFrame.PetClinic.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import shubh.SpringFrame.PetClinic.model.PetType;
import shubh.SpringFrame.PetClinic.model.Visit;
import shubh.SpringFrame.PetClinic.repositories.VisitRepository;
import shubh.SpringFrame.PetClinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDjpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDjpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
