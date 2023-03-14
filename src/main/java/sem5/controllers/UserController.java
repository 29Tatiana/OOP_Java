package sem5.controllers;

import sem5.model.Repository;
import sem5.model.User;
import sem5.model.ValidateUser;
import sem5.model.Fields;

import java.util.List;
public class UserController {
    private final Repository repository;
    private ValidateUser validator = new ValidateUser();
    public UserController(Repository repository) {
        this.repository = repository;
    }
    public void saveUser(User user) throws Exception {
        validator.check(user);
        repository.CreateUser(user);
    }
    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("User not found");
    }
    public List<User> readUsers() {
        List<User> users = repository.getAllUsers();
        return users;
    }
    public void deleteUser(String userId) {
        repository.deleteUser(userId);
    }
    public void updateUser(User user, Fields field, String param) throws Exception {
        if (field == Fields.TELEPHONE) {
            validator.checkPhone(param);
        }
        if (field == Fields.FIRSTNAME) {
            validator.check(user);
        }
        if (field == Fields.LASTNAME) {
            validator.check(user);
        }
        repository.updateUser(user, field, param);
    }
}

