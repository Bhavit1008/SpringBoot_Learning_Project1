package com.springboot.first_project.controller;

import com.springboot.first_project.model.Employee;
import com.springboot.first_project.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/addEmployee")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;

    @PostMapping
    public int addEmployee(@RequestBody Employee emp){
        return employeeServices.addEmployee(emp);
    }

    @GetMapping
    public List<Employee> getAllEmployeeData(){
        return employeeServices.getAllEmployeeData();
    }

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        return employeeServices.getEmployee(id);
    }

    @DeleteMapping("{id}")
    public int deleteEmployee(@PathVariable("id") int id){
        return employeeServices.deleteEmployee(id);
    }

    @PutMapping("{id}")
    public int updateEmployee(@PathVariable("id") int id,@RequestBody Employee emp){
        return employeeServices.updateEmployee(id,emp);
    }

}
