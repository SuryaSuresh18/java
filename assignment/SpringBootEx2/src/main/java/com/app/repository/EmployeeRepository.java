package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.employ.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}