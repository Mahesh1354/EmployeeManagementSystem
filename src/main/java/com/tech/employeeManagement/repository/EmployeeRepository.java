package com.tech.employeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.tech.employeeManagement.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Custom query for searching employees by name or email
    @Query("SELECT e FROM Employee e WHERE LOWER(e.firstName) LIKE LOWER(CONCAT('%', :searchQuery, '%')) OR LOWER(e.lastName) LIKE LOWER(CONCAT('%', :searchQuery, '%')) OR LOWER(e.email) LIKE LOWER(CONCAT('%', :searchQuery, '%'))")
    List<Employee> searchEmployees(String searchQuery);
}
