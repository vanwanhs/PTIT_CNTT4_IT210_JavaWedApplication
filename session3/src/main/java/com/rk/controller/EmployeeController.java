package com.rk.controller;

import com.rk.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/employees")
    public String getEmployees(Model model){

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"Nguyễn Văn A","Đào tạo",12000));
        list.add(new Employee(2,"Trần Văn B","Đào tạo",8000));
        list.add(new Employee(3,"Lê Văn C","Đào tạo",15000));

        model.addAttribute("employees",list);

        return "employee-list";
    }
}