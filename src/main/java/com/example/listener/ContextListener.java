package com.example.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.time.LocalDateTime;

public class ContextListener implements ServletContextListener {
    //
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("servletTimeInit", LocalDateTime.now());
    }
}
