package io.github.giovanaguedessilva.produtosapi.controller.Repository;

import io.github.giovanaguedessilva.produtosapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
