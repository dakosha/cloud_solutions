package kz.clouds.drugstore.entities.dictionaries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DICTIONARY_NOMENCLATUREGROUP_")
public class NomenclatureGroup {

	private long id;
	private String name;
	
	@Id
	@GeneratedValue
	@Column(name="ID_")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="NAME_")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
