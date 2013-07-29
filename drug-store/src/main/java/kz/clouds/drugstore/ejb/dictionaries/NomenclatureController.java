package kz.clouds.drugstore.ejb.dictionaries;

import javax.ejb.Stateless;

import kz.clouds.drugstore.ejb.basic.ControllerBase;
import kz.clouds.drugstore.entities.dictionaries.Nomenclature;

@Stateless
public class NomenclatureController extends ControllerBase<Nomenclature> {

	public void create(Nomenclature obj) {
		Nomenclature gr = new Nomenclature();
		gr.setBarcode(obj.getBarcode());
		gr.setCount(obj.getCount());
		gr.setPageCount(obj.getPageCount());
		gr.setType(obj.getType());
		gr.setName(obj.getName());
		super.create(gr);
	}
	
}
