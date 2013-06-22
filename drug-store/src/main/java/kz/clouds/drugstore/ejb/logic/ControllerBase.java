package kz.clouds.drugstore.ejb.logic;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class ControllerBase<T> implements Controller<T> {

	@Resource(mappedName = "java:jboss/drugstoreEntityManagerFactory")
	EntityManagerFactory emf;
	
	@Override
	public int create(T obj) {
		EntityManager em = emf.createEntityManager();
		em.persist(obj);
		return 0;
	}

	@Override
	public List<T> getAll(Class<?> clazz) {
		EntityManager em = emf.createEntityManager();
		return em.createQuery("select e from "+clazz.getName()).getResultList();
	}

	@Override
	public int delete(T obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
