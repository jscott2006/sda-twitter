package pl.sda.twitter.services;

import pl.sda.twitter.model.User;

public interface UserService {
    public User getUserByUserName(String username);
}
