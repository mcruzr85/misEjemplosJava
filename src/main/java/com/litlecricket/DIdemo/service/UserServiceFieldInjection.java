package com.litlecricket.DIdemo.service;

import com.litlecricket.DIdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserServiceFieldInjection implements Userservice{

    //Inyeccion de dependencia por Field/anotaciones utilizando el contenedor de Spring
    @Autowired
    UserRepository userRepository;
    @Override
    public List<String> getAllUsers() {
        return userRepository.getUsers();
    }
}
