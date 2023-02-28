package shubh.SpringFrame.PetClinic.repositories;

import org.springframework.data.repository.CrudRepository;
import shubh.SpringFrame.PetClinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
