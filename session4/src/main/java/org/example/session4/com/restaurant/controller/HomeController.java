package org.example.session4.com.restaurant.controller;

import org.example.session4.com.restaurant.model.Student;
import org.example.session4.com.restaurant.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping
// Các annocation phổ biến
/**
 *  Các Annotation hông khác gì bean dùng để khởi tạo và khởi tạo DI
 * - Conpomenent: Đánh dấu là bean để khởi tạo và không có ngữ nghĩa
 * -Controller: Đánh đấu là bean và mục đích điều hướng (lễ tân)
 * - Service: Đánh đấu là beasn và mục đích là ngiệp vụ
 * - Repository: Đánh dấu là bean và mục đích tương tác với database
 * -Autowired: Dùng để tiêm sự phụ thuộc (DI - Dependency Injenection)
 *
 *
 *
 */
/**
 * Biến của @RequestMapping
 * - @Getmapping: đại diện cho phương thức GET
 * -@PostMapping: đại diện cho phương thức POST
 * -@PutMapping: Đại diện cho phương thức PUT
 * -@PatchMapping: Đại diện cho phương thức Patch
 * -DeleteMapping: đại diện cho phương thức Deletee
 *
 *
 *
 */
public class HomeController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(Model model){
        List<Student> students = studentService.getAllStudent();
        System.out.println(students);
        model.addAttribute("students", students);// đưa dữ liệu vào Model
        return "home";
    }
}
