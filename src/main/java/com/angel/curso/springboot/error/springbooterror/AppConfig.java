package com.angel.curso.springboot.error.springbooterror;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.angel.curso.springboot.error.springbooterror.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    List<User> users(){
        List<User> users = new ArrayList<>();
        users.add(new User("Angel", "Fuentes", 1L));
        users.add(new User("Pepe", "Valera", 2L));
        users.add(new User("Jose", "Sánchez", 3L));
        users.add(new User("Alberto", "Martínez", 4L));

        return users;
    }
}
