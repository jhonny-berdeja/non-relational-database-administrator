package com.jberdeja.non_relational_database_administrator.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jberdeja.non_relational_database_administrator.entity.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, Long>{

    List<Person> findByDni(Long dni);
    
}