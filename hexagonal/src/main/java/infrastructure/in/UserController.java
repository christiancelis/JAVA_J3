package infrastructure.in;

import java.util.Scanner;

import application.CreateUserCase;
import domain.entity.User;

public class UserController {
    private final CreateUserCase createUserCase;

    public UserController(CreateUserCase createUserCase) {
        this.createUserCase = createUserCase;
    }

    public void start(){

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter username: ");
            String name = scanner.nextLine();
            System.out.println("Enter email: ");
            String email = scanner.nextLine();

            User user = new User();

            user.setName(name);
            user.setEmail(email);
            createUserCase.execute(user);
        }

        System.out.println("User created succesfully");

    }

    
}
