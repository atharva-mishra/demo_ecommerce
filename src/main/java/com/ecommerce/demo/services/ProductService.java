package com.ecommerce.demo.services;

import com.ecommerce.demo.modals.Products;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    List<Products> getAllProducts();
    void saveProduct(Products product);
    Products getProductById(int p_id);
    Page<Products> findPaginated(int pageNo,int pageSize);
}
