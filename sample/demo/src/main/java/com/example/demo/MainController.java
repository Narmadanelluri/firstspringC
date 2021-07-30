package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
	
	private static final Logger logger = LogManager.getLogger(MainController.class);
	
	@Autowired
	private NewService service;

		@RequestMapping(value = "/SampleModal",method=RequestMethod.GET)
	public List<SampleModal> list() {
		return service.listAllProducts();
		}


	@RequestMapping(value = "SampleModal/{pno}",method = RequestMethod.GET)
	public Optional<SampleModal> showSampleModal(@PathVariable Integer pno) {
		return service.getProductById(pno);
	}
	

	@RequestMapping(value = "SampleModal/edit/{pno}",method = RequestMethod.POST)
	public String edit(@PathVariable Integer pno) {
		Optional<SampleModal> sampleModel = service.getProductById(pno);
		sampleModel.get().setPname("changed");
		service.saveSimpleModal(sampleModel.get());
		return "productform";
	}
	

	@RequestMapping(value = "/SampleModal/save", method = RequestMethod.POST)
	public Integer saveSampleModal(SampleModal product) {
		logger.debug("in save method");
		service.saveSimpleModal(product);
		return product.getPno();
	}
	
	@RequestMapping(value = "SimpleModal/delete/{pno}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer pno) {
		service.deleteProduct(pno);
	}
	}
	

