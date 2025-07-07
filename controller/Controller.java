package com.example.SpringbootBasics.controller;

import com.example.SpringbootBasics.Model.Employee;
import com.example.SpringbootBasics.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EmployeeService hws;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return hws.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return hws.getEmployeeById(id);
    }


    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee emp) {
        return hws.addEmployee(emp);
    }

    @PutMapping("/employees/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmp) {
        return hws.updateEmployee(id, updatedEmp);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return hws.deleteEmployeeById(id);
    }
}
