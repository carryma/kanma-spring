package com.dao;

import com.model.Student;

import java.util.List;

public interface StudentDao {
    public int addStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudent(int id);
    public List<Student> findStudent();
}
