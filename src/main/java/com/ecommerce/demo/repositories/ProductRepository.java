package com.ecommerce.demo.repositories;

import com.ecommerce.demo.modals.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public interface ProductRepository extends JpaRepository<Products,Integer> {
}
