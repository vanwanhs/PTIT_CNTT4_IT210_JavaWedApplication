package org.example.session4.com.restaurant.service;

import org.example.session4.com.restaurant.repository.StudentDAO;
import org.example.session4.com.restaurant.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    //tiêm sự phụ thuộc
    @Autowired
    private StudentDAO studentDAO;
    public List<Student> getAllStudent(){
       List<Student> students =  studentDAO.findAll();
       return students;
    }
}
