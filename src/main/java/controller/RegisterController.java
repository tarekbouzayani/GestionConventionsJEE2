package main.java.controller;

import main.java.dao.UserDao;
import main.java.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterController", value = "/RegisterController")
public class RegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session= request.getSession();
        User user=(User) session.getAttribute("user");
        UserDao.save(user);
        response.sendRedirect("/WebPage/Authentication.jsp");
        session.removeAttribute("user");
    }
}
