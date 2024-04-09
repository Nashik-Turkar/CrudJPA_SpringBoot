package com.main.repository;
import org.springframework.data.repository .CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Employee;

@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer>{

	
	
	
}
