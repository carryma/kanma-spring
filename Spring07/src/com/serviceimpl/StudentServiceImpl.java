package com.serviceimpl;

import com.dao.StudentDao;
import com.model.Student;
import com.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public int deleteStudent(int id) {
        return studentDao.deleteStudent(id);
    }

    @Override
    public List<Student> findStudent() {
        return studentDao.findStudent();
    }
}
