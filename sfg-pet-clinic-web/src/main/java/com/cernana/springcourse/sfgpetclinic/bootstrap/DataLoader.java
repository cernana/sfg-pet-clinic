package com.cernana.springcourse.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cernana.springcourse.sfgpetclinic.model.Owner;
import com.cernana.springcourse.sfgpetclinic.model.Pet;
import com.cernana.springcourse.sfgpetclinic.model.Vet;
import com.cernana.springcourse.sfgpetclinic.service.OwnerService;
import com.cernana.springcourse.sfgpetclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;

	private final VetService vetService;

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		loadData();

	}

	private void loadData() {

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");

		Pet mikesPet = new Pet();
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");

		Pet fionasCat = new Pet();
		fionasCat.setOwner(owner2);
		fionasCat.setBirthDate(LocalDate.now());

		ownerService.save(owner2);

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");

		vetService.save(vet2);

	}

}
