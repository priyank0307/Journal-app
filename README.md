# Journal App Backend

A robust backend RESTful application built with **Spring Boot**, **MongoDB**, **Spring Security** and **Postman** designed for managing user accounts, authentication, and personal journal entries.

## Tech Stack
* **Language:** Java 17  
* **Framework:** Spring Boot
* **Database:** MongoDB (MongoDB Atlas)
* **Security:** Spring Security (HTTP Basic Auth, BCrypt Password Encoding, Role based Auth)
* **Build Tool:** Maven
* **API Testing:** Postman

## Features
* **User Management:** Secure user registration, profile updates, and authentication.
* **Basic Authentication:** Secured endpoints protected via HTTP Basic Authentication using Spring Security.
* **Journal Operations:** Full CRUD operations for users to create, read, update, and delete their personal journal entries.
* **Role-Based Access Control:** Distinct permission levels separating regular users from administrative routes (`/admin/**`).

## Getting Started
1. Clone the repository: `git clone https://github.com/priyank0307/Journal-app.git`
2. Configure your MongoDB URI in `src/main/resources/application.yml`.
3. Run the app: `mvn clean spring-boot:run`
