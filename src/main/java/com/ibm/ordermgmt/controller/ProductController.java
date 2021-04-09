package com.ibm.ordermgmt.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ordermgmt.product.Product;
import com.ibm.ordermgmt.service.ProductService;

import io.swagger.annotations.ApiOperation;

@RequestMapping("product")
@RestController
public class ProductController {

	
	Logger logger=LoggerFactory.getLogger(ProductController.class);

	@Autowired
	ProductService productService;
	
	@GetMapping("/{productCode}") //localhost:8085/product/1
	public ResponseEntity<Product> getProductInfo(@PathVariable(value="productCode")Long productCode) {
		
		Optional<Product> product= productService.getProduct(productCode);
				
				if(product.isPresent()) {
					
					return ResponseEntity.status(HttpStatus.OK).body(product.get());
				}else {
					
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				}
				
				
			}
	
	//@GetMapping("/{countryCode}") //localhost:8085/product/1
}
