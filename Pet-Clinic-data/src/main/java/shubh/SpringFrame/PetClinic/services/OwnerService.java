package shubh.SpringFrame.PetClinic.services;

import shubh.SpringFrame.PetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
