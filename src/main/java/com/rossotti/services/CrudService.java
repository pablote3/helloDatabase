package com.rossotti.services;

import java.util.List;

public interface CrudService<T> {
	List<?> listAll();

	T getById(Long id);

	T saveOrUpdate(T domainObject);

	void delete(Long id);
}
