package com.ecommerce.demo.controllers;

import com.ecommerce.demo.modals.Products;
import com.ecommerce.demo.repositories.ProductRepository;
import com.ecommerce.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/shopping")
public class EmployeeController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/available")
    public String ShowAllProducts(Model model) {
       return findPaginated(1,model);
    }


    @GetMapping("/addNewProductForm")
    public String addNewProductForm(Model model) {
        Products product = new Products();
        model.addAttribute("Product", product);
        return "new_product";
    }

    @PostMapping("/addProduct")
    public String SaveProduct(@ModelAttribute("Product") Products product) {
        productService.saveProduct(product);
        return "redirect: /ecommerce/available";
    }

    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
        int pageSize = 5;
        Page<Products> page = productService.findPaginated(pageNo, pageSize);
        List<Products> listProducts = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPage", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("listProducts", listProducts);
        return "available";
    }
}
