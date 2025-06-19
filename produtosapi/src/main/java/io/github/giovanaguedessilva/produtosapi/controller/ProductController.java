package io.github.giovanaguedessilva.produtosapi.controller;

import io.github.giovanaguedessilva.produtosapi.controller.Repository.ProductRepository;
import io.github.giovanaguedessilva.produtosapi.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("product")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    @RequestMapping("/save")
    public Product Save(@RequestBody Product product){
        System.out.println("Product received: "+ product);
        var id = UUID.randomUUID().toString();
        product.setId(id);
        productRepository.save(product);
        return product;
    }

    @GetMapping("/find/{id}")
    public Product getProductById(@PathVariable("id") String id){
//        Optional<Product> product = productRepository.findById(id);
//        return product.isPresent() ? product.get() : null;
        return productRepository.findById(id).orElse(null);
    }
}
