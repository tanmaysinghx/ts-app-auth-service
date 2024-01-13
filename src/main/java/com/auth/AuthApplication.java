package com.auth;

import com.auth.helper.UserFoundException;
import com.auth.model.Role;
import com.auth.model.User;
import com.auth.model.UserRole;
import com.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AuthApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
    	
        SpringApplication.run(AuthApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        try {
            System.out.println("starting code");
            User user = new User();

            user.setFirstName("Tanmay");
            user.setLastName("Singh");
            user.setUsername("tanmaysinghx");
            user.setPassword(this.bCryptPasswordEncoder.encode("Tanmay@1999"));
            user.setEmail("tanmaysinghx@gmail.com");
            user.setProfile("default.png");

            Role role1 = new Role();
            role1.setRoleId(44L);
            role1.setRoleName("ADMIN");

            Set<UserRole> userRoleSet = new HashSet<>();
            UserRole userRole = new UserRole();

            userRole.setRole(role1);

            userRole.setUser(user);

            userRoleSet.add(userRole);

            User user1 = this.userService.createUser(user, userRoleSet);
            System.out.println(user1.getUsername());


        } catch (UserFoundException e) {
            e.printStackTrace();


        }


    }


}
