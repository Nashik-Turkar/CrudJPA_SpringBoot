package com.main.service;

import com.main.model.Employee;

public interface HomeService {

	public void saveRegData(Employee e);

	public Iterable<Employee> getAllData();

	public void delete(int eid);

}
