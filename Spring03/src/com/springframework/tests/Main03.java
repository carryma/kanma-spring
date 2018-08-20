package com.springframework.tests;

import com.springframework.entity.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main03 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //默认依赖注入
        People people = (People) context.getBean("people");
        System.out.println(people);

        //setter注入
        People people1 = (People) context.getBean("people1");
        System.out.println(people1);

        //构造器注入（索引）
        People people2 = (People) context.getBean("people2");
        System.out.println(people2);

        //构造器注入（type）
        People people3 = (People) context.getBean("people3");
        System.out.println(people3);
    }

}
