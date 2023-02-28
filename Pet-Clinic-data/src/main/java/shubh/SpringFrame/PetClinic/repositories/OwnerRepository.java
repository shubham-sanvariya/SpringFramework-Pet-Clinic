package shubh.SpringFrame.PetClinic.repositories;

import org.springframework.data.repository.CrudRepository;
import shubh.SpringFrame.PetClinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
