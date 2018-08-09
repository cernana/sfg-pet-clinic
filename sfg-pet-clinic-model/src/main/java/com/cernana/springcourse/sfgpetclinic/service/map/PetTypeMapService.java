package com.cernana.springcourse.sfgpetclinic.service.map;

import java.util.Set;

import com.cernana.springcourse.sfgpetclinic.model.PetType;
import com.cernana.springcourse.sfgpetclinic.service.PetTypeService;

public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
	
	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}
	
    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }	
    
    @Override
    public PetType save(PetType petType) {
    	return super.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
