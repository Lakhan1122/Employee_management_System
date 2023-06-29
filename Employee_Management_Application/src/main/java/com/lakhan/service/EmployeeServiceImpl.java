package com.lakhan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakhan.Repo.EmployeeRepository;
import com.lakhan.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
        return repo.save(employee);

	
	}

	@Override
	public List<Employee> getAllEmployees() {
		 return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employeeDetails) {
		 Employee employee = repo.findById(id).orElse(null);
	        if (employee != null) {
	            employee.setFirstName(employeeDetails.getFirstName());
	            employee.setLastName(employeeDetails.getLastName());
	            employee.setEmail(employeeDetails.getEmail());
	            employee.setDepartment(employeeDetails.getDepartment());
	            return repo.save(employee);
	        }
	        return null;
	}

	@Override
	public void deleteEmployee(Long id) {
		repo.deleteById(id);
		
	}

	

}
