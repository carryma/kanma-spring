package com.tests;

import com.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        StudentService studentService = (StudentService)ac.getBean("studentServiceImpl");
        studentService.addStudent("makang");
    }
}

