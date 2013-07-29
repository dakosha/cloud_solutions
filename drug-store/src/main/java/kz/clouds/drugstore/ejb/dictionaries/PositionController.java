package kz.clouds.drugstore.ejb.dictionaries;

import javax.ejb.Stateless;

import kz.clouds.drugstore.ejb.basic.ControllerBase;
import kz.clouds.drugstore.entities.dictionaries.Position;

@Stateless
public class PositionController extends ControllerBase<Position> {

	public void create(Position obj) {
		Position gr = new Position();
		gr.setName(obj.getName());
		super.create(gr);
	}
	
}
