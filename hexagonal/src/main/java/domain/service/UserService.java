package domain.service;

import domain.entity.User;

public interface UserService {
    void createUser(User user);
    User findUserByid(Long id);
}
