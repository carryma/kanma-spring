package com.tests;

import com.model.Student;
import com.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoTest {
    private ApplicationContext ac ;
    @Before
    public void setUp() throws Exception {
        ac = new ClassPathXmlApplicationContext("application-context.xml");
    }
    @Test
    public void addStudent()throws Exception{
        StudentService studentService = (StudentService)ac.getBean("studentService");
        int addNums=studentService.addStudent(new Student(8,"王五", 27));
        if(addNums==1){
            System.out.println("添加成功");
        }
    }

    @Test
    public void deleteStudent()throws Exception{
        StudentService studentService = (StudentService)ac.getBean("studentService");
        int addNums=studentService.deleteStudent(19);
        if(addNums==1){
            System.out.println("删除成功");
        }
    }

    @Test
    public void updateStudent()throws Exception {
        StudentService studentService = (StudentService) ac.getBean("studentService");
        int addNums = studentService.updateStudent(new Student(8, "张三", 27));
        if (addNums == 1) {
            System.out.println("更新成功");
        }
    }

    @Test
    public void findStudent()throws Exception{
        StudentService studentService = (StudentService)ac.getBean("studentService");
        List<Student> studentList = studentService.findStudent();
        for(Student student:studentList){
            System.out.println(student);
        }
    }
}