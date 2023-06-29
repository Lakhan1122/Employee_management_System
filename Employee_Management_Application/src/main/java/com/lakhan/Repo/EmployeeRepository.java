package com.lakhan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lakhan.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}
