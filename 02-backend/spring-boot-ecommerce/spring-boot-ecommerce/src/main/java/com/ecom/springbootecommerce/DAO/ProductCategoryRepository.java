package com.ecom.springbootecommerce.DAO;

import com.ecom.springbootecommerce.Entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "ProductCategory", path = "Product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
