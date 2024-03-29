package pl.sda.twitter.servlets;

import pl.sda.twitter.model.TbUser;
import pl.sda.twitter.model.TbUser;
import pl.sda.twitter.services.UserService;
import pl.sda.twitter.services.UserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    private UserService userService;

    @Override
    public void init() {
        userService = new UserServiceImpl();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        TbUser tbUser = userService.getUserByUserName(userName);
        if (tbUser == null || !tbUser.getPassword().equals(password)) {
            response.setCharacterEncoding(UTF_8.toString());
            response.sendRedirect("sign-in.jsp");
        } else {
            session.setAttribute("user", tbUser);
            response.setCharacterEncoding(UTF_8.toString());
            response.sendRedirect("index.jsp");
        }
    }
}
