package com.selin.Bebka_Spring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

    @Data
    @Entity
    @Table(name="books")
    public class Book {
        @Getter
        @Setter
        @jakarta.persistence.Id
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String author;
        @ManyToOne
        @JoinColumn(name = "student_id")
        @JsonBackReference
        private Student student;

    }
