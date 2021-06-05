package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    private List<Book> books = new ArrayList<>();

    public BookController() {
        Book b = new Book();
        b.title = "Harry Potter and The Sorcerer Stone";
        b.author = "JK.Rowling";
        b.year = 2000;

        for (int i = 0; i < 10; i++) {
            books.add(b);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/book", method = {RequestMethod.GET})
    public String books() {
        return "Good";
    }

}

class Book {
    public String title;

    public String author;

    public Integer year;
}
