package com.arquitecturahexagonal;

import application.CreateUserCase;
import domain.service.UserService;
import infrastructure.in.UserController;
import infrastructure.out.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserRepository();
        CreateUserCase createUserCase = new CreateUserCase(userService);
        UserController controller = new UserController(createUserCase);

        controller.start();



    }
}