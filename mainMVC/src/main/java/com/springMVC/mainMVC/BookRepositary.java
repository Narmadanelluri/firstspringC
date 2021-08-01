package com.springMVC.mainMVC;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public  interface BookRepositary  extends CrudRepository<MyBookStall, Integer>{
	
	Optional<MyBookStall> findById(Integer id);
	public Iterable<MyBookStall> findAll();
	public void delete(MyBookStall entity);
	
}
