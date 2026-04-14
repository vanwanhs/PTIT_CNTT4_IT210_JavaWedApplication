package org.example.practive_session6.controller;

import org.example.practive_session6.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/course")
public class CourseController {

    private List<Course> courses = new ArrayList<>();

    public CourseController(){
        courses.add(new Course("IELTS-6.5","IELTS 6.5","Intermediate",5000000,
                "Lộ trình IELTS 6.5","Mr John",12,false,10, LocalDate.now()));

        courses.add(new Course("TOEIC-700","TOEIC 700","Beginner",3000000,
                "Lộ trình TOEIC","Ms Anna",10,false,0, LocalDate.now()));

        courses.add(new Course("IELTS-8.0","IELTS 8.0","Advanced",8000000,
                "Lộ trình nâng cao","Mr Tom",16,true,20, LocalDate.now()));

        courses.add(new Course("COMM","Giao tiếp","Beginner",2000000,
                "English Communication","Ms Linda",8,false,5, LocalDate.now()));

        courses.add(new Course("BUSINESS","Business English","Intermediate",6000000,
                "English for Business","Mr David",10,false,0, LocalDate.now()));
    }

    @GetMapping("/list")
    public String list(
            @RequestParam(value="level", defaultValue = "") String level,
            @RequestParam(value="maxFee", defaultValue = "99999999") double maxFee,
            Model model){

        List<Course> filtered = courses.stream()
                .filter(c -> level.isEmpty() || c.getLevel().equalsIgnoreCase(level))
                .filter(c -> c.getFee() <= maxFee)
                .collect(Collectors.toList());

        model.addAttribute("courses", filtered);
        return "course-list";
    }

    @GetMapping("/detail/{code}")
    public String detail(@PathVariable("code") String code, Model model){
        for(Course c : courses){
            if(c.getCode().equals(code)){
                model.addAttribute("course", c);
            }
        }
        return "course-detail";
    }

    @GetMapping("/edit/{code}")
    public String edit(@PathVariable("code") String code, Model model){
        for(Course c : courses){
            if(c.getCode().equals(code)){
                model.addAttribute("course", c);
            }
        }
        return "course-form";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Course course){
        for(Course c : courses){
            if(c.getCode().equals(course.getCode())){
                c.setFee(course.getFee());
                c.setStartDate(course.getStartDate());
            }
        }
        return "redirect:/course/list";
    }

    @PostMapping("/delete/{code}")
    public String delete(@PathVariable("code") String code, Model model){
        for(Course c : courses){
            if(c.getCode().equals(code)){
                if(c.getStudentCount() == 0){
                    courses.remove(c);
                    break;
                }else{
                    model.addAttribute("error",
                            "Không thể hủy khóa học đã có học viên đăng ký");
                    return "course-list";
                }
            }
        }
        return "redirect:/course/list";
    }
}