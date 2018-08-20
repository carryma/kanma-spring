package com.springframework.kanma.tests;

//import com.springframework.kanma.services.TestWork;
//import com.springframework.kanma.services.Yue;

import com.springframework.kanma.services.TestWork;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
       /* TestWork testWork= new TestWork();
        testWork.setTester(new Yue());
        testWork.test();
        */
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       TestWork testWork=(TestWork)context.getBean("testWork");
       testWork.test();



    }
}
