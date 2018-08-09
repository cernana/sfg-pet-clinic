package com.cernana.springcourse.sfgpetclinic.service;

import com.cernana.springcourse.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);

}
