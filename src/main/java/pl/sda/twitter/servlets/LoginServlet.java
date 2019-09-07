package pl.sda.twitter.servlets;

import pl.sda.twitter.model.User;
import pl.sda.twitter.services.UserService;
import pl.sda.twitter.services.UserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        UserService userService = new UserServiceImpl();
        User user = userService.getUserByUserName(userName);
        if (user != null) {
            //użytkownik nie istnieje
        } else if (user.getPassword().equals(password)) {
            //wprowadzone chasło jest niepopoprawne
        } else {
            //logowanie poprawne
        }
    }
}
