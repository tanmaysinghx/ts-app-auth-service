package com.auth;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AuthApplication {


    public static void main(String[] args) {
    	System.out.println("tes-app-auth-service is running");
        SpringApplication.run(AuthApplication.class, args);

    }



}
