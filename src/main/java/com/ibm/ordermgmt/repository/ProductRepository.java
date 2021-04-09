package com.ibm.ordermgmt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ibm.ordermgmt.product.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
