package com.mongodb.example.mongodbproj.controller;

import com.mongodb.example.mongodbproj.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mongodb.example.mongodbproj.repository.BookRepo;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepo repo ;


    @PostMapping("/save")
    public String addBook(@RequestBody Book b){
        repo.save(b);
        return "Addded successfuly";


    }
    @GetMapping("/getBooks")
    public ResponseEntity<List<Book>> addBook1() {
        if (null != repo.findAll()) {
            return ResponseEntity.ok(repo.findAll());
        }
    return null;

    }

}
