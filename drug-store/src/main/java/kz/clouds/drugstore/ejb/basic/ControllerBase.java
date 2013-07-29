package kz.clouds.drugstore.ejb.basic;

import javax.persistence.EntityManager;

public abstract class ControllerBase<T> {

	@SuppressWarnings("unchecked")
	private T entity = (T) new Object();
	
	public EntityManager em;
	
	public void create(T obj) {
		em.persist(obj);
	}
	
	public void delete(T obj) {
		em.remove(obj);
	}
	
	public T get(long id) {
		System.out.println(entity.getClass());
		return null;
	}
	
}
