package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.main.model.Employee;
import com.main.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService hsi;
	
	@RequestMapping("/" )
	public String home() {
		return "Home";
	}
	@RequestMapping("/home")
	public String forhome() {
		return "Home";
	}
	
	@RequestMapping("/preReg")
	public String preRegister() {
		return "register";
	}
	
	@RequestMapping("/allData")
	public String allData(Model m) {
		Iterable<Employee> list=hsi.getAllData();
		m.addAttribute("Data",list);
		return "success";
	}
	
	@RequestMapping("/regData")
	public String RegData(@ModelAttribute Employee e) {
		Iterable<Employee> list=hsi.getAllData();
		for (Employee emp : list) {
			if(e.getEid()!=emp.getEid()) {
				System.out.println(e);
				hsi.saveRegData(e);
				return "Home";
			}else {
				System.out.println("ID Alredy Exist. Plaese Use Different ID.!!!");
			}
		}
		return "Home";
	}
	

	
	@RequestMapping("/edit")
	public String editpage(@RequestParam int eid,Model m) {
		System.out.println(eid);
		Iterable<Employee> list=hsi.getAllData();
		for (Employee emp : list) {
			if(eid==emp.getEid()) {
				m.addAttribute("e",emp);
				return "edit";
			}
		}
		return "success";
	}
	
	@RequestMapping("/regUpdate")
	public String update(@ModelAttribute Employee e,Model m) {
		hsi.saveRegData(e);
		
		Iterable<Employee> list=hsi.getAllData();
		m.addAttribute("Data",list);
		return "success";
	}
	

	@RequestMapping("/delete")
	public String delete(@RequestParam int eid, Model m) {
		hsi.delete(eid);
		
		Iterable<Employee> list=hsi.getAllData();
		m.addAttribute("Data",list);
		return "success";
	}
	
	
	
	
	
}
