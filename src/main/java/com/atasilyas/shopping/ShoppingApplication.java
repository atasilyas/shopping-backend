package com.atasilyas.shopping;

import com.atasilyas.shopping.model.Book;
import com.atasilyas.shopping.model.BookCategory;
import com.atasilyas.shopping.repository.BookCategoryRepository;
import com.atasilyas.shopping.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class ShoppingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingApplication.class, args);
    }


    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    public static List<BookCategory> bookCategoryList = new ArrayList<>();
    public static List<Book> bookList = new ArrayList<>();
    public static int range = 0;

    @Override
    public void run(String... args) throws Exception {

        for (int i = 1; i < 6; i++) {
            BookCategory bookCategory = new BookCategory();
            bookCategory.setCategoryName(i + ". Category");
            bookCategoryList.add(bookCategory);
        }

        for (int i = 0; i < 50; i++) {
            Book book = new Book();
            book.setActive(true);
            book.setCreatedOn(new Date());
            book.setUpdatedOn(new Date());

            book.setBookCategory(bookCategoryList.get(range));
            range++;
            if (range == 5){
                range = 0;
            }
            book.setDescription("test book");
            book.setImageUrl("assets/images/books/1.jpeg");
            book.setName(i + ".Book");
            book.setSku("sku nedir bilmiyorum");
            book.setUnitPrice(new BigDecimal(12));
            book.setUnitInStock(i);
            bookList.add(book);
        }


        bookRepository.saveAll(bookList);


    }
}
