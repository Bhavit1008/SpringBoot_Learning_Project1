package com.springboot.first_project.service;

import com.springboot.first_project.dao.EmployeeDao;
import com.springboot.first_project.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServices {

    @Autowired
    private EmployeeDao employeeDao;

    public int addEmployee(Employee emp){
        return employeeDao.addEmployee(emp);
    }

    public List<Employee> getAllEmployeeData(){
        return employeeDao.getAllEmployeeData();
    }

    public Employee getEmployee(int id){
        return employeeDao.getEmployee(id);
    }

    public int deleteEmployee(int id){
        return employeeDao.deleteEmployee(id);
    }

    public int updateEmployee(int id,Employee emp){
        return employeeDao.updateEmployee(id,emp);
    }
}
