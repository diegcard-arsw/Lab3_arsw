package edu.eci.arsw.blueprints;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.eci.arsw.blueprints.services.BlueprintsServices;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        BlueprintsServices svc = ctx.getBean(BlueprintsServices.class);
        System.out.println("BlueprintsServices bean: " + svc);
        ctx.close();
    }
}
