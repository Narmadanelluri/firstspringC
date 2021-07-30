package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstRepositary extends CrudRepository<SampleModal, Integer>
{
	List<SampleModal> findAll();
	
	Optional<SampleModal> findById(Integer id);
	
	void deleteById(Integer id);
	
	SampleModal save(SampleModal sampleModal);
	
}

