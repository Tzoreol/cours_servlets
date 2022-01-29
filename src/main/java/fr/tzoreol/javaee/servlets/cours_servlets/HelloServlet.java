package fr.tzoreol.javaee.servlets.cours_servlets;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Hello", urlPatterns = {"/Hello"})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello L3!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.getWriter().println("<html><body>" + request.getAttribute("firstname") + "</body></html>");
    }

    public void destroy() {
    }
}