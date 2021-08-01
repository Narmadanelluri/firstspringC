package com.springMVC.mainMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@org.springframework.stereotype.Service
public class BookService {
	

	    @Autowired
	    private BookRepositary repository;

	    public List<MyBookStall> getAllBooks() {
	    	
	        List<MyBookStall> books = new ArrayList<>();
	        repository.findAll().forEach(books::add);
for(MyBookStall bookStall : books) {
	System.out.println(bookStall.getAuthor());
	
}
	        return books;
	    }

	    public MyBookStall  getBook(Integer id) {
	        return repository.findById(id).orElseGet(MyBookStall::new);
	    }

	    public MyBookStall addBook(MyBookStall whiskey) {
	        return repository.save(whiskey);
	    }

	    public MyBookStall updateBook(String id, MyBookStall whiskey) {
	       return  repository.save(whiskey);
	    }

	    public MyBookStall deleteBook(Integer id) {
	        repository.deleteById(id);
			return null;
	    }
	}