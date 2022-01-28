package fr.tzoreol.javaee.servlets.cours_servlets;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello L3!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");

        if(name != null) {
            // Hello
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Hello " + name + "!</h1>");
            out.println("</body></html>");
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }

    public void destroy() {
    }
}