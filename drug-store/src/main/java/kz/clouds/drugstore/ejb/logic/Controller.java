package kz.clouds.drugstore.ejb.logic;

import java.util.List;

public interface Controller<T> {

	public int create(T obj);
	public List<T> getAll(Class<?> clazz);
	public int delete(T obj);
	public T get(Long id);
	
}
