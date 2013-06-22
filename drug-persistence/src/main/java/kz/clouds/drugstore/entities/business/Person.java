package kz.clouds.drugstore.entities.business;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import kz.clouds.drugstore.entities.dictionaries.Position;
import kz.clouds.drugstore.entities.enums.Gender;

@Entity
@Table(name="BUSINESS_PERSON_")
public class Person {

	private Long id;
	private String lastName;
	private String name;
	private String middleName;
	private Date birthDate;
	private Gender gender;
	private Position position;
	
}
