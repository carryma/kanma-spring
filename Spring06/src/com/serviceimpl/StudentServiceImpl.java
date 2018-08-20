package com.serviceimpl;

import com.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(String name) {
        System.out.println("添加了学生："+ name);
    }
}
