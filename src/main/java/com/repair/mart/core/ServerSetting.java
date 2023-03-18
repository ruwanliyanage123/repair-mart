package com.repair.mart.core;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Server setting up for the application
 */

public final class ServerSetting {
    private ServerSetting() {
    }

    private static class LazyServerSettingInitializer{
        public static final ServerSetting INSTANCE = new ServerSetting();
    }

    public static ServerSetting getInstance(){
        return LazyServerSettingInitializer.INSTANCE;
    }

    public void setupServer() throws Exception {
        Server server = new Server(8080);
        ServletContextHandler contextHandler = new ServletContextHandler();
        contextHandler.setContextPath("/");
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("com.repair.mart.core.config");
        ServletHolder servletHolder = new ServletHolder(new DispatcherServlet(context));
        contextHandler.addServlet(servletHolder, "/*");
        server.setHandler(contextHandler);
        server.start();
        server.join();
    }
}
