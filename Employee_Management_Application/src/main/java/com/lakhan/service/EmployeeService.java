package com.lakhan.service;

import java.util.List;

import com.lakhan.entity.Employee;

public interface EmployeeService {
	
			public Employee registerEmployee(Employee employee);
	 
		    public List<Employee> getAllEmployees();
		    
		    public Employee getEmployeeById(Long id);
	
		   
	
		    public Employee updateEmployee(Long id, Employee employeeDetails);
		    
	
		    public void deleteEmployee(Long id); 
}
