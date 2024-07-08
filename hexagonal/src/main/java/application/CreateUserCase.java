package application;

import domain.entity.User;
import domain.service.UserService;

public class CreateUserCase {
    private final UserService userService;

    public CreateUserCase(UserService userService) {
        this.userService = userService;
    }

    public void execute(User user){
        userService.createUser(user);
    }
        
}
