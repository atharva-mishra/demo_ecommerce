package com.ecommerce.demo.services;

import com.ecommerce.demo.modals.Products;
import com.ecommerce.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productrepository;

    @Override
    public List<Products> getAllProducts()
    {
        return productrepository.findAll();
    }

    @Override
    public void saveProduct(Products product)
    {
        productrepository.save(product);
    }

    @Override
    public Products getProductById(int p_id) {
        Optional<Products> optional=productrepository.findById(p_id);
        Products products;
        if(optional.isPresent()){
            products=optional.get();
        }else{
            throw new RuntimeException("Product not available for id:: " + p_id);
        }
        return products;
    }

    @Override
    public Page<Products> findPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1,pageSize);
        return this.productrepository.findAll(pageable);
    }
}
