package com.example.SpringbootBasics.Services;

import com.example.SpringbootBasics.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(101, "Ravi", "CSE"),
                    new Student(102, "Priya", "ECE")
            )
    );

    public List<Student> getAllStudents() {
        return students;
    }

    public String addStudent(Student student) {
        students.add(student);
        return "Student added: " + student.getName();
    }

    public String putMethod() {
        return "PUT method called for Student";
    }

    public String deleteMethod() {
        return "DELETE method called for Student";
    }

    public String postMethod() {
        return "POST method called for Student";
    }
}