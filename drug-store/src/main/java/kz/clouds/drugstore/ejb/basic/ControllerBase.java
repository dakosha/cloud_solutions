package kz.clouds.drugstore.ejb.basic;

import java.util.List;

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
	
	public void delete(Class<?> clazz, long id) {
		try {
			em = emf.createEntityManager();
			Object obj = em.find(clazz, id);
			if (obj!=null)
				em.remove(obj);
		}
		finally {
			if (em!=null)
				em.close();
		}
	}
	
	public T get(Class<?> clazz, long id) {
		try {
			em = emf.createEntityManager();
			Object obj = em.find(clazz, id);
			if (obj!=null)
				return (T) obj;
			return null;
		}
		finally {
			if (em!=null)
				em.close();
		}
	}
	
	public List<T> getAll(Class<?> clazz, String order) {
		try {
			em = emf.createEntityManager();
			List<Object> obj = em.createQuery("from "+clazz.getName()+" order by "+order).getResultList();
			if (obj!=null)
				return (List<T>) obj;
			return null;
		}
		finally {
			if (em!=null)
				em.close();
		}
	}
	
}
