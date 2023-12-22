package com.example.amoozesh.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator="person_seq")
    @SequenceGenerator(name="person_seq", sequenceName = "person_seq", allocationSize = 10000)
    private long id;
    @Enumerated(EnumType.STRING)
    private PersonType personType;
    private String fname;
    private String lastName;
    private  String adress;
    private String email;
    private  String phone;
}
