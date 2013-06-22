package kz.clouds.drugstore.entities.security;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SECURITY_PERMISSION_")
public class Permission {

	private Long id;
	private String name;
	
}
