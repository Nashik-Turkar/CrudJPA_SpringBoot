package com.main.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Employee;
import com.main.repository.HomeRepository;
import com.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hri;
	
	@Override
	public void saveRegData(Employee e) {
		hri.save(e);
	}


	@Override
	public Iterable<Employee> getAllData() {
		Iterable<Employee> e=hri.findAll();
		return e;
	}

	@Override
	public void delete(int eid) {
		hri.deleteById(eid);       
	}

}
