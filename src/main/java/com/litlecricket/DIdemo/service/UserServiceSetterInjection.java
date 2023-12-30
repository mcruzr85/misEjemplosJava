package com.litlecricket.DIdemo.service;

import com.litlecricket.DIdemo.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserServiceSetterInjection implements Userservice{

    private UserRepository userRepository;
//Inyeccion de dependencia por setter
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<String> getAllUsers() {
        return userRepository.getUsers();
    }
}
