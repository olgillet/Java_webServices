package com.mysite.myapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysite.myapp.model.Product;


@RestController
public class ProductController {

	@GetMapping("/product")
	public Product getOne() {
		return new Product("product1", 100d);
	}
}
