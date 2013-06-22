package kz.clouds.drugstore.entities.dictionaries;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="DICTIONARY_POSITION_")
public class Position {

	private Long id;
	private String name;
	
}
