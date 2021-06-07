package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

    private final Book book = new Book();

    @RequestMapping(value = "/book", method = {RequestMethod.GET})
    public String books(Model model) {
        book.setTitle("Harry Potter");
        book.setAuthor("J.K.Rowling");
        book.setYear(2000);
        model.addAttribute(book);
        return "hello";
    }

}

