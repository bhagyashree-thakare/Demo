package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Product;
import com.jbk.service.ProductService;

@RestController
public class Product_Controller {

	@Autowired
	ProductService productservice;

	@PostMapping("/add_Product")
	public Object addProduct(@RequestBody Product product) {

		int resp = productservice.addProduct(product);

		if (resp == 1)
			return "Product Added.....";
		else
			return "Product Already exist....";
	}

}
