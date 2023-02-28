package shubh.SpringFrame.PetClinic.repositories;

import org.springframework.data.repository.CrudRepository;
import shubh.SpringFrame.PetClinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
