package com.springboot.empolyee.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.empolyee.management.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
