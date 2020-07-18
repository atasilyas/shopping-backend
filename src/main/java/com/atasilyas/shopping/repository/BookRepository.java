package com.atasilyas.shopping.repository;

import com.atasilyas.shopping.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}