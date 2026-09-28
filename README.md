# Journal App Backend  

A robust backend RESTful application built with **Spring Boot**, **MongoDB**, **Spring Security** and **Postman** designed for managing user accounts, authentication, personal journal entries, and automated testing.

## Tech Stack

* **Language:** Java 17
* **Framework:** Spring Boot
* **Database:** MongoDB (MongoDB Atlas)
* **Security:** Spring Security (HTTP Basic Auth, BCrypt Password Encoding, Role Based Authentication)
* **Testing:** JUnit 5, Spring Boot Test, Mockito
* **Build Tool:** Maven
* **API Testing:** Postman

---


## Profiles

Environment Profiles
This application uses Spring Boot profiles to separate configuration properties between development and production environments.

Configuration Files
Development (application-dev.yml): Used for local testing and debugging. It typically connects to a local MongoDB instance and enables debug logging.

Production (application-prod.yml): Used for live deployment. It contains secure production database URIs, optimized connection pools, and disabled debug logs.

Activating a Profile
You can activate a specific profile using any of the standard Spring Boot methods:


---

Via Command Line:

Bash
java -jar target/JournalApp-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
Via application.yml (Default Profile):

YAML
spring:
  profiles:
    active: dev
Via Environment Variable:

Bash
export SPRING_PROFILES_ACTIVE=prod


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
