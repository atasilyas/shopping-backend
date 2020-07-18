package com.atasilyas.shopping.repository;

import com.atasilyas.shopping.model.BookCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "book-category")
public interface BookCategoryRepository  extends JpaRepository<BookCategory, Long> {
    
}