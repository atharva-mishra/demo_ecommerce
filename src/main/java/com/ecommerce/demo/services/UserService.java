package com.ecommerce.demo.services;

import com.ecommerce.demo.DTO.UserRegistrationDTO;
import com.ecommerce.demo.modals.Products;
import com.ecommerce.demo.modals.Role;
import com.ecommerce.demo.modals.User;
import com.ecommerce.demo.repositories.ProductRepository;
import com.ecommerce.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Products> ReturnProducts(){
        List<Products> threeproducts;
        return threeproducts=productRepository.findAll();
    }

    public User save(UserRegistrationDTO userRegistrationDTO){
        User user= new User(userRegistrationDTO.getFirstname(),
                userRegistrationDTO.getLastname(),userRegistrationDTO.getEmail(),
                userRegistrationDTO.getPassword(), Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);
    }
}
