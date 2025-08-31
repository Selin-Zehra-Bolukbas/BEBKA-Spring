package com.selin.Bebka_Spring.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String department;
    private double salary;

}
