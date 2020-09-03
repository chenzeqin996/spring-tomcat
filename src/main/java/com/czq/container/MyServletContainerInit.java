package com.czq.container;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes({IX.class})
public class MyServletContainerInit implements ServletContainerInitializer {

    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("my serveletContainerInitializer!");
        System.out.println("set size:" + (set!=null?set.size():0));
    }
}
