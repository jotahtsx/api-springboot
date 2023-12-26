package com.jotahtsx.apispringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.jotahtsx.apispringboot.repositories.ProductRepository;

@RestController
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;

    
}
