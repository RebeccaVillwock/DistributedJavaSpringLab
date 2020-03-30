package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.Mini;

public class SpringApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Mini theMini = context.getBean(Mini.class);

        System.out.println(theMini.getName());
        System.out.println(theMini.getLoggingService());
    }
}
