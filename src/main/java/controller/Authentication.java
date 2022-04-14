package main.java.controller;

import main.java.dao.UserDao;
import main.java.model.User;
import main.java.util.HibernateUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Authentication", value = "/Authentication")
public class Authentication extends HttpServlet {

    public void init() {
        HibernateUtil.getSessionFactory();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/WebPage/Authentication.jsp");
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        ServletContext application=getServletContext();
        HttpSession session =request.getSession();
        User u = UserDao.findByLoginAndMdp(login, password) ;
        if (u==null) {
            request.setAttribute("erreur", "Veuillez vous inscrire avant pouvoir accéder !!!");
            getServletContext().getRequestDispatcher("/Auth.jsp").forward(request, response);

        }
        else {

            session.setAttribute("utilisateur_courant", u);
            response.sendRedirect("/WebPage/Dashboard.jsp.");
        }



    }
}
