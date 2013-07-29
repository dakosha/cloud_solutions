package kz.clouds.drugstore.ejb.basic;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import kz.clouds.drugstore.entities.dictionaries.NomenclatureGroup;

@WebService
public class NomenclatureGroupControllerWs {

	@Inject NomenclatureGroupController bean;
	
	@WebMethod
	public void create(NomenclatureGroup obj) {
		bean.create(obj);
	}
	
}
