package com.denil.products.ProductsList.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class MainController {
@Autowired
Products p;
	List<Products> p1=new ArrayList<Products>();
	static int count=1;
	@GetMapping("/welcome")
	public String welcomeMessage() {
		return "Hello world ";
	}
	
	@PostMapping("/add/productname/{productname}/price/{price}")
	public ResponseEntity<Object> userAdded(@PathVariable String productname,@PathVariable int price) {
		
		p1.add(new Products(price,productname));
		
		return new ResponseEntity<>("product added ",HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public List<Products> getAllProducts(){
		return p1;
	}
}
