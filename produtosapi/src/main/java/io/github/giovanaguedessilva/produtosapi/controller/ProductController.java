package io.github.giovanaguedessilva.produtosapi.controller;

import io.github.giovanaguedessilva.produtosapi.controller.Repository.ProductRepository;
import io.github.giovanaguedessilva.produtosapi.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @GetMapping("{id}")
    public Product getById(@PathVariable("id") String id){
//        Optional<Product> product = productRepository.findById(id);
//        return product.isPresent() ? product.get() : null;
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable("id") String id){
        productRepository.deleteById(id);
        return "Product with ID '"+id+"' successfully deleted!";
    }

    @PutMapping("{id}")
    public String update(@PathVariable("id") String id, @RequestBody Product product){
        product.setId(id);
        productRepository.save(product);
        return "Product with ID '"+id+"' successfully updated!";
    }

    @GetMapping
    public List<Product> findAllProducts(@RequestParam("name") String name){
        return productRepository.findByName(name);
    }
}
