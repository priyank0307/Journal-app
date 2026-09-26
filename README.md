# Journal App Backend

A robust backend RESTful application built with **Spring Boot**, **MongoDB**, and **Spring Security** designed for managing user accounts, authentication, personal journal entries, and automated testing.

## Tech Stack

* **Language:** Java 17
* **Framework:** Spring Boot
* **Database:** MongoDB (MongoDB Atlas)
* **Security:** Spring Security (HTTP Basic Auth, BCrypt Password Encoding)
* **Testing:** JUnit 5, Spring Boot Test, Mockito
* **Build Tool:** Maven
* **API Testing:** Postman

---

## Features

* **User Management:** Secure user registration, profile updates, and authentication.
* **Basic Authentication:** Secured endpoints protected via HTTP Basic Authentication using Spring Security.
* **Journal Operations:** Full CRUD operations for users to create, read, update, and delete their personal journal entries.
* **Role-Based Access Control:** Distinct permission levels separating regular users from administrative routes (`/admin/**`).
* **Automated Testing:** Comprehensive unit and integration testing suite implemented using JUnit to ensure component reliability.

---

## Project Structure

```text
src/
├── main/
│   ├── java/com/engineeringdigest/JournalApp/
│   │   ├── config/       # Spring Security & App Configurations
│   │   ├── controller/   # REST Controllers (User, Journal, Admin, Public)
│   │   ├── entity/       # MongoDB Document Models (User, JournalEntry)
│   │   ├── repository/   # Spring Data MongoDB Repositories
│   │   └── service/      # Business Logic & Service Implementations
│   └── resources/
│       └── application.properties # Database and Server Configurations
└── test/
    └── java/com/engineeringdigest/JournalApp/ # JUnit Test Classes
