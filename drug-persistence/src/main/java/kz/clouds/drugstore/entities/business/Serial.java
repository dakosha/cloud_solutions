package kz.clouds.drugstore.entities.business;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kz.clouds.drugstore.entities.dictionaries.Nomenclature;

@Entity
@Table(name="BUSINESS_SERIAL_")
public class Serial {
	
	private long id;
	private String name;
	private Nomenclature nomenclature;
	private Date expireDate;

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
	
	@ManyToOne
	public Nomenclature getNomenclature() {
		return nomenclature;
	}
	public void setNomenclature(Nomenclature nomenclature) {
		this.nomenclature = nomenclature;
	}
	
	@Column(name="EXPIRE_")
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
		
}
