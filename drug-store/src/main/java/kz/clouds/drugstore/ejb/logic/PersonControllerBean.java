package kz.clouds.drugstore.ejb.logic;

import java.util.List;

import kz.clouds.drugstore.entities.business.*;

public class PersonControllerBean extends ControllerBase<Person> implements PersonController {

	@Override
	public int create(Person obj) {
		return super.create(obj);
	}
	
	@Override
	public List<Person> getAll(Class<?> clazz) {
		return super.getAll(clazz);
	}
	
}
