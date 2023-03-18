package com.repair.mart.core;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
public class Application {
    public static void main(String[] args) throws Exception {
        // Create the server
        Server server = new Server(8080);

        // Create the servlet context handler and set the context path
        ServletContextHandler contextHandler = new ServletContextHandler();
        contextHandler.setContextPath("/");

        // Create the application context and set the configuration location
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("com.repair.mart.core.config");

        // Create a dispatcher servlet and add it to the context handler
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        ServletHolder servletHolder = new ServletHolder(dispatcherServlet);
        contextHandler.addServlet(servletHolder, "/*");

        // Add the necessary servlet mappings to the context handler
        contextHandler.addServlet(DefaultServlet.class, "/");
        contextHandler.addServlet(DispatcherServlet.class, "/api/*");

        // Add the context handler to the server and start the server
        server.setHandler(contextHandler);
        server.start();
        server.join();
    }
}
