package kz.clouds.drugstore.entities.dictionaries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kz.clouds.drugstore.entities.enums.NomenclatureType;

@Entity
@Table(name="DICTIONARY_NOMENCLATURE_")
public class Nomenclature {

	private Long id;
	private String name;
	private String originalBarcode;
	private NomenclatureType type;
	private int count;
	private int pageCount;
	
	@Id
	@GeneratedValue
	@Column(name="ID_")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="NAME_")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="ORIGINAL_BARCODE_")
	public String getOriginalBarcode() {
		return originalBarcode;
	}
	public void setOriginalBarcode(String originalBarcode) {
		this.originalBarcode = originalBarcode;
	}
	
	@Column(name="TYPE_")
	public NomenclatureType getType() {
		return type;
	}
	public void setType(NomenclatureType type) {
		this.type = type;
	}
	
	@Column(name="COUNT_")
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Column(name="PAGE_COUNT_")
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
}
