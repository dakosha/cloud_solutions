package kz.clouds.drugstore.ejb.dictionaries;

import javax.ejb.Stateless;

import kz.clouds.drugstore.ejb.basic.ControllerBase;
import kz.clouds.drugstore.entities.dictionaries.NomenclatureGroup;

@Stateless
public class NomenclatureGroupController extends ControllerBase<NomenclatureGroup> {
	
	public void create(NomenclatureGroup obj) {
		NomenclatureGroup gr = new NomenclatureGroup();
		gr.setName(obj.getName());
		super.create(gr);
	}
	
}
