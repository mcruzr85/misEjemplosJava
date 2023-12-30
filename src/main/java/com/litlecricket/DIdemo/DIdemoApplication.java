package com.litlecricket.DIdemo;

import com.litlecricket.DIdemo.repository.UserRepository;
import com.litlecricket.DIdemo.service.UserServiceConstructorInjection;
import com.litlecricket.DIdemo.service.UserServiceFieldInjection;
import com.litlecricket.DIdemo.service.UserServiceSetterInjection;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DIdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DIdemoApplication.class, args);
	}

	@Autowired
	UserServiceConstructorInjection constructorInjectionUserService;
	@Autowired
	UserServiceSetterInjection setterInjectionUserService;
	@Autowired
	UserServiceFieldInjection fieldInjectionUserService;

	@PostConstruct
	public void executeExample(){

		//Constructor Injection
		System.out.println("resultados por constructor" + constructorInjectionUserService.getAllUsers());


		//Setter injection
		//Tengo que pasarle una instancia del UserRepository
		//porque cuando se crea el obj setterInj.. el no lo tiene, sino que tiene el setter para inyectar la dependencia
		UserRepository userRep= new UserRepository();
		setterInjectionUserService.setUserRepository(userRep);

		System.out.println("resultados por setter" + setterInjectionUserService.getAllUsers());

		//Field injection
		System.out.println("resultados por field" + fieldInjectionUserService.getAllUsers());
	}





}
