package com.power4j.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JnaDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JnaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("===============================================================");
        System.out.println(" LD_LIBRARY_PATH:" + System.getenv("LD_LIBRARY_PATH"));
        System.out.println("===============================================================");
        JnaTest.testInit();
    }

}
