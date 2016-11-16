package com.rossotti.repository;

import java.util.List;

import com.rossotti.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
}