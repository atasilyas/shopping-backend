package com.atasilyas.shopping.repository;

import com.atasilyas.shopping.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long> {
    
}