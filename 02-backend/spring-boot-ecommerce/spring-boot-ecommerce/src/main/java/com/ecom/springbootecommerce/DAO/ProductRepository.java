package com.ecom.springbootecommerce.DAO;

import com.ecom.springbootecommerce.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
