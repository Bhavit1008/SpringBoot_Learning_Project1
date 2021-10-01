package com.springboot.first_project.dao;

import com.springboot.first_project.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDao{

    List<Employee> employees = new ArrayList<>();
    @Override
    public int addEmployee(Employee emp) {
        employees.add(emp);
        return 1;
    }

    @Override
    public List<Employee> getAllEmployeeData() {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        for(Employee emp : employees){
            if(emp.getEmpId() == id){
                return emp;
            }
        }
        return null;
    }

    @Override
    public int deleteEmployee(int id) {
        Employee empToDelete = null;
        for(Employee emp : employees){
            if(emp.getEmpId() == id){
                empToDelete = emp;
            }
        }
        if(empToDelete != null){
            employees.remove(empToDelete);
            return 1;
        }
        else
            return 0;
    }

    @Override
    public int updateEmployee(int id, Employee emp) {
        int index = 0;
        for(Employee e:employees){
            if(e.getEmpId() == id){
                index++;
                employees.set(index,emp);
            }
        }
        if(employees.get(index) != null){
            return 1;
        }
        else
            return 0;
    }
}
