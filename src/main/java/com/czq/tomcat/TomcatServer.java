package com.czq.tomcat;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class TomcatServer {

    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(55100);
        tomcat.addWebapp("/","G:\\test\\");
        try {
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

    }
}
