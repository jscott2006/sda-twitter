package pl.sda.twitter.services;

import pl.sda.twitter.exceptions.PasswordNotMatchException;
import pl.sda.twitter.model.TbUser;
import pl.sda.twitter.model.UserDao;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDao();

    @Override
    public TbUser getUserByUserName(String username) {
        TbUser userByUserName = userDao.getUserByUserName(username);
        if (userByUserName == null) {
            throw new PasswordNotMatchException("password or username does not match");
        }
        return userByUserName;
    }
}
