package com.mongodb.example.mongodbproj.repository;

import com.mongodb.example.mongodbproj.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends MongoRepository<Book,Integer> {
}
