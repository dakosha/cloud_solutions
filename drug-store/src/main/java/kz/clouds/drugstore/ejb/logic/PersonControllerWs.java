package kz.clouds.drugstore.ejb.logic;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebService;

import kz.clouds.drugstore.entities.business.Person;

@WebService(name="PersonControllerWs")
public class PersonControllerWs {

	@Inject
	private PersonController controller;
	
	public int create(Person obj) {
		Person person = new Person();
		person.setBirthDate(obj.getBirthDate());
		person.setGender(obj.getGender());
		person.setLastName(obj.getLastName());
		person.setName(obj.getName());
		person.setMiddleName(obj.getMiddleName());
		return controller.create(person);
	}
	
	public List<Person> getAll() {
		return controller.getAll(Person.class);
	}
	
}
