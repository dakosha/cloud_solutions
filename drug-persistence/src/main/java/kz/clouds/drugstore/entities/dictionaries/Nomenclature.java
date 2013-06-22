package kz.clouds.drugstore.entities.dictionaries;

import javax.persistence.Entity;
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
	
}
