package shubh.SpringFrame.PetClinic.repositories;

import org.springframework.data.repository.CrudRepository;
import shubh.SpringFrame.PetClinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
