package com.klef.jfsd.exam.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.klef.jfsd.exam.model.Product;

@Service
public class ProductService {

    @Autowired
    private RestTemplate restTemplate;

    public List<Product> getAllProducts() {
        ResponseEntity<Product[]> response = restTemplate.getForEntity("https://fakestoreapi.com/products", Product[].class);
        return Arrays.asList(response.getBody());
    }
}