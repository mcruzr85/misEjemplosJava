package com.litlecricket.DIdemo.repository;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private List<String> users;

    public UserRepository(){
        //datos de ejemplos para simular que devuelve datos
        users = new ArrayList<>();
        users.add("Meybis");
        users.add("Ismael");
        users.add("Luis");
        users.add("Marcos");
        users.add("Lucas");
    }

    public List<String> getUsers(){
        return users;
    }
}
