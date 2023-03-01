package com.books.controller;

import com.books.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BooksController {

    @RequestMapping("/books")
    public Map<String, Object> getValues() {
        Map<String, Object> data = new HashMap<>();
        data.put("message","Hi , My name is Priya Sharma");
        data.put("languages", Arrays.asList("Hindi","Punjabi","English"));
        data.put("phoneNumber",769679);
        return data;

    }
}
