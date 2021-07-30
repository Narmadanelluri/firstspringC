package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewService {
		
		
		@Autowired
		private FirstRepositary firstrepository;
		

		public List<SampleModal> listAllProducts() {
			return firstrepository.findAll();
		}

		public Optional<SampleModal> getProductById(Integer pno) {
			return firstrepository.findById(pno);
		}

		public SampleModal saveSimpleModal(SampleModal modal) {
			
			return firstrepository.save(modal);
		}

		public void deleteProduct(Integer id) {
			firstrepository.deleteById(id);
		}


}
