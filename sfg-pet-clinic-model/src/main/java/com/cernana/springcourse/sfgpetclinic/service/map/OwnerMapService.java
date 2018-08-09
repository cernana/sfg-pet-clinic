package com.cernana.springcourse.sfgpetclinic.service.map;

import java.util.Set;

import com.cernana.springcourse.sfgpetclinic.model.Owner;
import com.cernana.springcourse.sfgpetclinic.service.OwnerService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }	
    
    @Override
    public Owner save(Owner owner) {
    	return super.save(owner);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
