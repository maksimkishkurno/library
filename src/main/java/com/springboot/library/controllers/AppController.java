package com.springboot.library.controllers;

import com.springboot.library.product.BookEntity;
import com.springboot.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<BookEntity> listOfBooks = bookService.findAll();
        model.addAttribute("listOfBooks", listOfBooks);
        return "index";
    }
}
