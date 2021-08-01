package com.springMVC.mainMVC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@org.springframework.stereotype.Controller
@EnableAutoConfiguration
@RestController
public class BookController {
	@Autowired
	private BookService service;
 
    @GetMapping("/books")
    public List<MyBookStall> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/books/{bookId}")
    public MyBookStall getBook(@PathVariable Integer bookId){
        return service.getBook(bookId);
    }

    @PostMapping("/addBook")
    public MyBookStall addBook(@RequestBody MyBookStall book) {
       return service.addBook(book);
    }

    @PutMapping("/books/{bookId}")
    public MyBookStall updateBook(@PathVariable String bookId, @RequestBody MyBookStall book) {
        return service.updateBook(bookId, book);
        
    }

    @DeleteMapping("/books/{bookId}")
    public MyBookStall deleteBook(@PathVariable Integer bookId) {
        return service.deleteBook(bookId);
    
}

	
	
	}
	
	
	

