package shubh.SpringFrame.PetClinic.repositories;

import org.springframework.data.repository.CrudRepository;
import shubh.SpringFrame.PetClinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
