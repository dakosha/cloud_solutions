package kz.clouds.drugstore.ejb.business;

import javax.ejb.Stateless;

import kz.clouds.drugstore.ejb.basic.ControllerBase;
import kz.clouds.drugstore.entities.business.Serial;

@Stateless
public class SerialController extends ControllerBase<Serial> {

	public void create(Serial obj) {
		Serial gr = new Serial();
		gr.setName(obj.getName());
		gr.setExpireDate(obj.getExpireDate());
		super.create(gr);
	}
	
}
