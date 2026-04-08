package org.example.session4.com.restaurant.repository;

import org.example.session4.com.restaurant.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class StudentDAO {
    private List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Phạm Thị Hồng Nhung",19,true),
                    new Student(2,"Phạm Thị Hồng ",19,true),
                    new Student(2,"Phạm Thị Hồng ",19,true)
            )
    );
    public List<Student> findAll(){
        return this.students;
    }
}
