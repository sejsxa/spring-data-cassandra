package com.example.springdatacassandra.controller;

import com.example.springdatacassandra.model.Person;
import com.example.springdatacassandra.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @RequestMapping(method = RequestMethod.POST, value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createAndSelectPerson(@RequestBody Person person) {
        repository.save(person);
        Person p = repository.findById(person.getId()).get();
        return p.toString();
    }
}
