package com.tests;

import com.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("annotation-bean.xml");
        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
        obj1.setMessage("This is my first Spring using Annotation:@Component component-scan");
        obj1.getMessage();
        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
        obj2.setMessage("This is my first Spring using Annotation:@Component component-scan");
        obj2.getMessage();
        System.out.println("单例：" + (obj1 == obj2));
    }
}
