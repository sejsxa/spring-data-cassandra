package com.example.springdatacassandra.repositories;

import com.datastax.driver.core.ConsistencyLevel;
import com.example.springdatacassandra.model.Person;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Consistency;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends CassandraRepository<Person, String> {

    @Consistency(ConsistencyLevel.ONE)
        // how to set CL in repository
    Optional<Person> findById(String id);

    Person save(Person person);
}
