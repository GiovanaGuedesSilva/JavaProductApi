package io.github.giovanaguedessilva.produtosapi.controller.Repository;

import io.github.giovanaguedessilva.produtosapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    public List<Product> findByName(String name);

}
