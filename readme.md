# eCommerce Application - Microservice Architecture

This project is a microservices-based **eCommerce application** built using **Spring Boot**. It consists of multiple independent services working together to create a scalable and maintainable eCommerce platform. This repository focuses on the **Service Discovery** module, which enables dynamic service registration and discovery for microservices within the system.

## Microservices Overview
This eCommerce application follows a modular architecture, consisting of the following key microservices:

- [User Service](https://github.com/ahmadrashidh/user-service): Handles user authentication, registration, and profile management.
- [Product Service](https://github.com/ahmadrashidh/product-service): Manages product catalog, including listing, searching, and details.
- [Payment Service](https://github.com/ahmadrashidh/payment-service): Handles payments using Stripe API
- [API Gateway](https://github.com/ahmadrashidh/ecom-apigateway.git): Manages all external API requests and provides load balancing, routing.

## Service Discovery Module

### Overview
The **Service Discovery** module ensures seamless communication between microservices. It is implemented using **Spring Cloud Netflix Eureka**, allowing services to register themselves and discover other services dynamically.

### Features
- Service registration and discovery using **Spring Cloud Netflix Eureka**.
- Load balancing support for microservices.
- Ensures scalability and fault tolerance in a microservices architecture.

### Tech Stack
- **Spring Boot** - Java-based framework for building microservices.
- **Spring Cloud Netflix Eureka** - Service discovery and registry.
- **Maven** - Build and dependency management.

### Getting Started
#### Prerequisites
Ensure you have the following installed:
- Java 17 or later
- Maven 3+

#### Installation & Running the Service
1. Clone the repository:
   ```bash
   git clone https://github.com/ahmadrashidh/ecomapp-service-discovery.git
   cd ecomapp-service-discovery
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the service:
   ```bash
   mvn spring-boot:run
   ```

The Eureka dashboard will be available at: `http://localhost:8761`

### Configuration

To configure Eureka Server, include the following properties in `application.properties`:
```properties
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
eureka.server.enable-self-preservation=true
```
### Future Scope
The following enhancements is considered and are being implemented:

#### 1. Asynchronous Communication
- To Implement **Kafka** or **RabbitMQ** for event-driven communication between microservices.
- Reduce dependency on synchronous REST calls to improve scalability and resilience.

#### 2. Kubernetes & Containerization
- Deploy microservices using **Docker** and orchestrate them with **Kubernetes**.


