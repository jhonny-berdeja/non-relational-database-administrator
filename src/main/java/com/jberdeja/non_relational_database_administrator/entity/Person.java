package com.jberdeja.non_relational_database_administrator.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "people")
public class Person {

    @Id
    private ObjectId id;

    private String name;
    private String lastname;
    private Integer age;
    private Long dni;

}
