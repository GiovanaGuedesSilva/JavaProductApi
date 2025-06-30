
# 🛒 JavaProductApi

This is a RESTful API built with Java and Spring Boot, designed to manage product data. The API provides full CRUD functionality and follows clean architecture practices with layers like controllers, services, and repositories.

---

## 🔧 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL or H2 (configurable)
- Maven
- Lombok
- Swagger / OpenAPI (for API documentation)

---

## 📦 Features

- CRUD operations for products
- RESTful JSON-based API
- Data validation and custom exceptions
- Persistence using JPA and Hibernate
- Swagger for API exploration and testing

---

## ▶️ How to Run the Project

### Prerequisites

- Java 17+
- Maven
- (Optional) Docker and PostgreSQL

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/GiovanaGuedesSilva/JavaProductApi.git
   cd JavaProductApi
   ```

2. Run the application using Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Access the API at:
   ```
   http://localhost:8080
   ```

4. Access Swagger UI at:
   ```
   http://localhost:8080/swagger-ui.html
   ```

---

## 🗂️ Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com.example.productapi/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       ├── service/
│   │       └── ProductApiApplication.java
│   └── resources/
│       ├── application.properties
│       └── data.sql / schema.sql (if present)
```

---

## 🧪 Tests

To run tests:

```bash
./mvnw test
```

---

## 📄 License

This project is under the [MIT License](LICENSE) – you are free to use, modify, and distribute it.


