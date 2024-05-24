package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Your authentication logic here
        // For demonstration, let's assume username is "admin" and password is "admin123"
        if ("admin".equals(username) && "admin123".equals(password)) {
            response.sendRedirect("welcome.html");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
