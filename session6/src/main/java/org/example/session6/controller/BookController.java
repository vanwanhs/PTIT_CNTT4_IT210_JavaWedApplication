package org.example.session6.controller;


import org.example.session6.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    private List<Book> books = new ArrayList<>();

    public BookController() {
        books.add(new Book(1,"Java Core","Nguyen Van A",250000.00));
        books.add(new Book(2,"Spring MVC","Tran Van B",350000.00));
        books.add(new Book(3,"ReactJS","Le Van C",280000.00));
        books.add(new Book(4,"Microservices","Pham Van D",450000.00));
    }

    @GetMapping("/books")
    public String showBooks(Model model){
        model.addAttribute("books", books);
        model.addAttribute("title", "Danh sách sách");
        return "book-list";
    }

    @GetMapping("/books/{id}")
    public String bookDetail(@PathVariable int id, Model model){
        for(Book b : books){
            if(b.getId() == id){
                model.addAttribute("book", b);
                break;
            }
        }
        model.addAttribute("title", "Chi tiết sách");
        return "book-detail";
    }
}
