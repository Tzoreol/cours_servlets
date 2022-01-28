package fr.tzoreol.javaee.servlets.cours_servlets;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Hello", urlPatterns = {"/Hello"})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello L3!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();


        out.println("<html><body>");
        if((session != null) && (session.getAttribute("connected") != null) &&  ((boolean) session.getAttribute("connected"))) {
            out.println("<h2>Connected</h2>");
        } else {
            out.println("<a href=\"CreateSession\">Create session</a>");
        }

        //Greater than 1 because JSESSIONID is automatically created
        if((cookies != null) && (cookies.length > 1)) {
            for(Cookie cookie : cookies) {
                out.println("<h3>" + cookie.getName() + " => " + cookie.getValue() + "</h3>");
            }
        } else {
            Cookie newCookie = new Cookie("doesItHaveCookie", "true");
            newCookie.setMaxAge(900);

            response.addCookie(newCookie);
        }

        out.println("<h4>We are in " + getServletContext().getInitParameter("year") + "</h4>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}