# Enterprise Application Assignment 1

## Student Information

| Field              | Details                                      |
| ------------------ | -------------------------------------------- |
| **Name**           | Biruk Mulatu                                 |
| **Student Number** | ATE/9686/14                                  |
| **Course**         | SE 4801 — Enterprise Application Development |
| **University**     | CTBE                                         |
| **Department**     | Software Engineering                         |

---

## Project Overview

**ShopWave Starter** is a RESTful API built using **Java 21** and **Spring Boot 3.x** for managing a simple product catalog.

This project was developed as part of **Assignment 1** for the Enterprise Application Development* course.

It demonstrates a full Spring Boot application architecture, including:

The application uses an **H2 in-memory database**, so no external database setup is required.

---

## Prerequisites

Make sure you have the following installed:

* Java 21
* Maven

---

## Build the Project

Run the following command:

```bash
mvn clean package -DskipTests
```

---

## Run the Application

### 1: Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Locate `ShopWaveApplication.java`
3. Click the **green run button** next to the main method

### Application URL

Once the application starts, it will be available at:

```
http://localhost:8080
```

---

##  Run Tests

To execute tests, run:

```bash
mvn test
```

### Expected Output

```
Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```





