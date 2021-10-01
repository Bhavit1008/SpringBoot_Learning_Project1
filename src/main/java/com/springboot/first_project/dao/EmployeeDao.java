package com.springboot.first_project.dao;

import com.springboot.first_project.model.Employee;

import java.util.List;

public interface EmployeeDao {
    int addEmployee(Employee emp);

    List<Employee> getAllEmployeeData();

    Employee getEmployee(int id);

    int deleteEmployee(int id);

    int updateEmployee(int id,Employee emp);
}
