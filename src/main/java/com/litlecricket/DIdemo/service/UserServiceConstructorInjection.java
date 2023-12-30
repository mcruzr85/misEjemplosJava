package com.litlecricket.DIdemo.service;

import com.litlecricket.DIdemo.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserServiceConstructorInjection implements Userservice{
    private final UserRepository userRepository;
    //Inyeccion de dependencia por constructor

    public UserServiceConstructorInjection(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<String> getAllUsers() {
        return userRepository.getUsers();
    }
}
