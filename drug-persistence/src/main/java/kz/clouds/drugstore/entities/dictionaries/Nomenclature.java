package kz.clouds.drugstore.entities.dictionaries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @id - идентификатор
 * @group - группа фармакологическая, для подбора замены
 * name - наименование
 * barcode - баркод на упаковке, для быстрого поиска
 * type - тип препарата, можно ли продавать и делить его при продаже
 * count - кол-во в упаковке (по умолчанию = 1)
 * pageCount - минимальное кол-во которое можно продать (по умолчанию = 1) 
 * 
 * @author dauren
 *
 */
@Entity
@Table(name="DICTIONARY_NOMENCLATURE_")
public class Nomenclature {

	private Long id;
	private NomenclatureGroup group;
	private String name;
	private String barcode;
	private NomenclatureType type = NomenclatureType.SIMPLE;
	private int count = 1;
	private int pageCount = 1;
	
	public enum NomenclatureType {
		SIMPLE,
		DIVIDED
	}
	
	@Id
	@GeneratedValue
	@Column(name="ID_")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	public NomenclatureGroup getGroup() {
		return group;
	}
	public void setGroup(NomenclatureGroup group) {
		this.group = group;
	}
	
	@Column(name="NAME_")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="BARCODE_")
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
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
