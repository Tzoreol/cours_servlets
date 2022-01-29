package fr.tzoreol.javaee.servlets.cours_servlets;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class GlobalListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionActivationListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println(event.getName() + " created with value " + event.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println(event.getName() + " removed");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println(event.getName() + " changed to " + event.getValue());
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println( "Session created");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session destroyed");
    }
}
