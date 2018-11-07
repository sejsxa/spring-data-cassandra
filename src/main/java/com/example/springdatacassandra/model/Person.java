package com.example.springdatacassandra.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Person {

    @PrimaryKey
    private final String id;

    private final String name;
    private final int age;

    @JsonCreator
    public Person(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("age") int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("{ @type = %1$s, id = %2$s, name = %3$s, age = %4$d }",
                getClass().getName(), getId(), getName(), getAge());
    }
}
