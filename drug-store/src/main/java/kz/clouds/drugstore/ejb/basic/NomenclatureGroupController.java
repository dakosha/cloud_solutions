package kz.clouds.drugstore.ejb.basic;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;

import kz.clouds.drugstore.entities.dictionaries.NomenclatureGroup;

@Stateless
public class NomenclatureGroupController extends ControllerBase<NomenclatureGroup> {
	
	@Resource(mappedName = "java:jboss/drugstoreEntityManagerFactory")
	public EntityManagerFactory emf;
	
	public void create(NomenclatureGroup obj) {
		try {
			em = emf.createEntityManager();
			
			NomenclatureGroup gr = new NomenclatureGroup();
			gr.setName(obj.getName());
			super.create(gr);
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			if (em!=null)
				em.close();
		}
		
		
	}
	
}
