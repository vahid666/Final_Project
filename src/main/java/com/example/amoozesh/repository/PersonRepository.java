package com.example.amoozesh.repository;

import com.example.amoozesh.model.Person;
import org.hibernate.sql.Insert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "person",collectionResourceRel = "person")
public interface PersonRepository extends JpaRepository<Person,Long> {





}
