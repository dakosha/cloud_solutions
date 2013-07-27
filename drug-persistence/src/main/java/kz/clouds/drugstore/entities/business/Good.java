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
@Table(name="GOOD_")
public class Good {

	private long id;
	private Nomenclature nomenclature;
	private Serial serial;
	private String barcode;
	private Date expireDate;
	private int amount;
	
	@Id
	@GeneratedValue
	@Column(name="ID_")
	public long getId() {
		return id;
	}
	
	@ManyToOne
	public Nomenclature getNomenclature() {
		return nomenclature;
	}
	
	@ManyToOne
	public Serial getSerial() {
		return serial;
	}
	
	@Column(name="BARCODE_")
	public String getBarcode() {
		return barcode;
	}
	
	@Column(name="EXPIRE_")
	public Date getExpireDate() {
		return expireDate;
	}
	
	@Column(name="AMOUNT_")
	public int getAmount() {
		return amount;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setNomenclature(Nomenclature nomenclature) {
		this.nomenclature = nomenclature;
	}
	public void setSerial(Serial serial) {
		this.serial = serial;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
