package kz.clouds.drugstore.ejb.business;

import javax.ejb.Stateless;

import kz.clouds.drugstore.ejb.basic.ControllerBase;
import kz.clouds.drugstore.entities.business.Person;

@Stateless
public class PersonController extends ControllerBase<Person> {

	public void create(Person obj) {
		Person gr = new Person();
		gr.setBirthDate(obj.getBirthDate());
		gr.setGender(obj.getGender());
		gr.setLastName(obj.getLastName());
		gr.setMiddleName(obj.getMiddleName());
		gr.setName(obj.getName());
		super.create(gr);
	}
	
}
