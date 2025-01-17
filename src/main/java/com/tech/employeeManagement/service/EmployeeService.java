package com.tech.employeeManagement.service;

import java.util.List;
import org.springframework.data.domain.Page;
import com.tech.employeeManagement.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Employee> findPaginated(int pageNo, int pageSize);
    List<Employee> searchEmployees(String searchQuery); // Add this method
}
