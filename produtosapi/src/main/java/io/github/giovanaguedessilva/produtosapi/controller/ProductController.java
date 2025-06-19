package io.github.giovanaguedessilva.produtosapi.controller;

import io.github.giovanaguedessilva.produtosapi.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @PostMapping
    @RequestMapping("/save")
    public Product Save(@RequestBody Product product){
        System.out.println("Product received: "+ product);
        return product;
    }
}
