package kz.clouds.drugstore.entities.security;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SECURITY_GROUP_")
public class Group {

	private Long id;
	private String name;
	private List<Account> accounts;
	private List<Permission> permissions;
	
}
