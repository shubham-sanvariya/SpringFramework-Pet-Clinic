package shubh.SpringFrame.PetClinic.services;

import shubh.SpringFrame.PetClinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);

    List<Owner> findByLastNameLike(String lastName);
}
