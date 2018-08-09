package com.cernana.springcourse.sfgpetclinic.service.map;

import java.util.Set;

import com.cernana.springcourse.sfgpetclinic.model.Vet;
import com.cernana.springcourse.sfgpetclinic.service.VetService;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
	
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }	
    
    @Override
    public Vet save(Vet vet) {
    	return super.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
