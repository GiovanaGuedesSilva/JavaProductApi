package io.github.giovanaguedessilva.produtosapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

//POJO -> Plain Old Java Object

@Entity
@Table(name = "tProduct")
public class Product {

    @Id
    @Column(name = "id")

    private String cod;

    private String name;

    private String description;

    @Column(name = "cost")
    private String price;

    public String getId() {
        return cod;
    }

    public void setId(String cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + cod + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

// With the Lombok library, I can use @Data to automatically generate getters and setters for all fields

//import lombok.Data;
//
//@Data
//public class Product {
//    private String cod;
//    private String name;
//    private String description;
//    private String price;
//}
