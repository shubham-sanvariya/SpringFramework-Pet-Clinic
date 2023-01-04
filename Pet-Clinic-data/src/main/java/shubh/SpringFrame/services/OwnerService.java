package shubh.SpringFrame.services;

import shubh.SpringFrame.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
