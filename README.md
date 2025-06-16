# Spring-Boot_Rest-Api
# 📓 Journal App – Spring Boot REST API

A full-featured, end-to-end **Journal application** built with Spring Boot and MongoDB.  
This project demonstrates building a RESTful backend with CRUD operations, MongoDB integration, and clean architecture.

---

## 🚀 Features

- 🧾 Create, Read, Update, Delete (CRUD) journal entries
- 👤 User registration and lookup
- 🌐 RESTful API with JSON support
- 💾 MongoDB as NoSQL database
- 📦 Spring Boot for rapid development

---

## 🛠️ Tech Stack

| Layer       | Technology                     |
|-------------|--------------------------------|
| Backend     | Spring Boot 3.2.x              |
| Database    | MongoDB                        |
| Build Tool  | Maven                          |
| Language    | Java 17                        |
| Dev Tools   | Lombok, Spring DevTools        |
| Testing     | Spring Boot Starter Test       |

---

## 📂 Project Structure

Journal-app/
├── src/
│ ├── main/java/com/example/Journal/app/
│ │ ├── controller/
│ │ ├── service/
│ │ ├── entity/
│ │ ├── repository/
│ │ └── JournalApp.java
│ └── resources/
│ ├── application.yml
│ └── static/
└── pom.xml



---

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/your-username/Journal-app.git
cd Journal-app


./mvnw clean install
./mvnw spring-boot:run
