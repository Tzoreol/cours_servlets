package fr.tzoreol.javaee.servlets.cours_servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "CreateSession", urlPatterns = {"/CreateSession"})
public class CreateSession extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.setAttribute("connected", true);

        response.sendRedirect(getServletContext().getContextPath() + "/Hello");
    }
}
