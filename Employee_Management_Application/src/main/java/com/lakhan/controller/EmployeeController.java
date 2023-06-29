package com.lakhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lakhan.entity.Employee;
import com.lakhan.service.EmployeeService;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	
	    @Autowired
	    private EmployeeService service;
	    
	    
	    @PostMapping
	    public Employee registerEmployee(@RequestBody Employee employee) {
	        return service.registerEmployee(employee);
	    }
	
		@GetMapping
	    public List<Employee> getAllEmployees() {
	        return service.getAllEmployees();
	    }

	    @GetMapping("/{id}")
	    public Employee getEmployeeById(@PathVariable("id") Long id) {
	        return service.getEmployeeById(id);
	    }

	   

	    @PutMapping("/{id}")
	    public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employeeDetails) {
	        return service.updateEmployee(id, employeeDetails);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteEmployee(@PathVariable("id") Long id) {
	    	service.deleteEmployee(id);
	    }

}
