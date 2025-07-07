package com.example.SpringbootBasics.Services;

import com.example.SpringbootBasics.Model.Employee;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>(
            Arrays.asList(
                    new Employee(1, "Prashanth", "Trainer"),
                    new Employee(2, "Yuvraj", "Faculty")
            )
    );

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        boolean flag = false;
        Employee foundEmployee = null;

        for (Employee e : employees) {
            if (e.getUserid() == id) {
                flag = true;
                foundEmployee = e;
                break;
            }
        }

        if (flag) {
            return foundEmployee;
        } else {
            throw new RuntimeException("Employee not found with id: " + id);
        }
    }



    public String addEmployee(Employee emp) {
        employees.add(emp);
        return "Employee added: " + emp.getName();
    }

    public String updateEmployee(int id, Employee updatedEmp) {
        for (Employee e : employees) {
            if (e.getUserid() == id) {
                e.setName(updatedEmp.getName());
                e.setJob(updatedEmp.getJob());
                return "Employee updated: " + updatedEmp.getName();
            }
        }
        return "Employee not found with id: " + id;
    }

    public String deleteEmployeeById(int id) {
        boolean removed = employees.removeIf(e -> e.getUserid() == id);
        return removed ? "Employee deleted with id: " + id : "Employee not found with id: " + id;
    }
}
