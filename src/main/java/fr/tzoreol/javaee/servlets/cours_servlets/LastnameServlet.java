package fr.tzoreol.javaee.servlets.cours_servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Lastname", urlPatterns = {
        "/Lastname"
})
public class LastnameServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println(request.getParameter("firstname") + " " + request.getParameter("lastname"));
        writer.println("</body></html>");
    }
}
