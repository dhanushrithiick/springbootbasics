package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Data // ✅ Generates all getters, setters, toString, etc.
@AllArgsConstructor
@NoArgsConstructor
@Entity
@@ -70,3 +101,4 @@ public class Employee {

    private String role;
}