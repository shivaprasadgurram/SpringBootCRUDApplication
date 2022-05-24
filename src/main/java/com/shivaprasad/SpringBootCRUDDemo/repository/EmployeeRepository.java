package com.shivaprasad.SpringBootCRUDDemo.repository;

import com.shivaprasad.SpringBootCRUDDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
