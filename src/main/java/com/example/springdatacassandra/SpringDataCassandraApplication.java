package com.example.springdatacassandra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataCassandraApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringDataCassandraApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringDataCassandraApplication.class, args);
    }
}
