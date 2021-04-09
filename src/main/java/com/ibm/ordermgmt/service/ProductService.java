package com.ibm.ordermgmt.service;

import com.ibm.ordermgmt.product.Product;
import com.ibm.ordermgmt.repository.ProductRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


	@Autowired
	ProductRepository productRepository;
	
	public Optional<Product> getProduct(Long productCode)
	
	{
		
		return productRepository.findById(productCode);
	}
}
