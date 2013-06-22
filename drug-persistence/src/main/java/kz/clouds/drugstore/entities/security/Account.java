package kz.clouds.drugstore.entities.security;

import javax.persistence.Entity;
import javax.persistence.Table;

import kz.clouds.drugstore.entities.business.Person;

@Entity
@Table(name="SECURITY_ACCOUNT_")
public class Account {

	private Long id;
	private Person person;
	private String password;
	
}
