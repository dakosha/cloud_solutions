package kz.clouds.drugstore.ejb.basic;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class ControllerBase<T> {

	@Resource(mappedName = "java:jboss/drugstoreEntityManagerFactory")
	public EntityManagerFactory emf;
	
	public EntityManager em;
	
	public void create(T obj) {
		try {
			em = emf.createEntityManager();
			em.persist(obj);
		}
		finally {
			if (em!=null)
				em.close();
		}
	}
	
	public void delete(T obj) {
		em.remove(obj);
	}
	
}
