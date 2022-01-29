package fr.tzoreol.javaee.servlets.cours_servlets;


import javax.servlet.*;
import java.io.IOException;

public class MagicWordFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if(servletRequest.getParameter("please") == null) {
            servletResponse.getWriter().println("<html><body><iframe src=\"https://giphy.com/embed/3ohzdQ1IynzclJldUQ\" width=\"480\" height=\"310\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe></body></html>");
        } else {
            servletRequest.setAttribute("firstname", "Rick");
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
