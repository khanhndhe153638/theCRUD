package com.example.thecrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String email;
}
