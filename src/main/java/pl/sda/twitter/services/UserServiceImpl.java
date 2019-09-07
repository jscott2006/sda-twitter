package pl.sda.twitter.services;

import pl.sda.twitter.model.User;

public class UserServiceImpl implements UserService {
    @Override
    public User getUserByUserName(String username) {

        return new User((long) 1, "admin", "password");
    }
}
