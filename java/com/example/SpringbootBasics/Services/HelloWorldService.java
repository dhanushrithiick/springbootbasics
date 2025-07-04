package com.example.SpringbootBasics.Services;

import com.example.SpringbootBasics.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {

    List<Employee> employees = new ArrayList<>(
            Arrays.asList(
                    new Employee(1, "Prashanth", "Trainer"),
                    new Employee(2, "Yuvraj", "Faculty")
            )
    );

    public List<Employee> helloWorld() {
        return employees;
    }

    public String putMethod() {
        return "PUT method called";
    }


    public String postMethod() {
        return "POST method called";
    }

    public String deleteMethod() {
        return "DELETE method called";
    }
    public String addEmployee(Employee emp) {
        employees.add(emp);
        return "Employee added: " + emp.getName();
    }
}