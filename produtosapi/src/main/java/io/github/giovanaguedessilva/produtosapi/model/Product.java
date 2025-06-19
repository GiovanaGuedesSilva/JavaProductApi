package io.github.giovanaguedessilva.produtosapi.model;

//POJO -> Plain Old Java Object
public class Product {

    private String id;
    private String name;
    private String description;
    private String price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
                "id='" + id + '\'' +
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
//    private String id;
//    private String name;
//    private String description;
//    private String price;
//}
