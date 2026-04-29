# User Management System

## Overview
User Management System is a secure backend REST API built using Spring Boot.
It provides user registration, authentication, authorization, and role-based access control.
The application uses Spring Security for authentication and access management,
and MySQL for persistent data storage.

## Features
- User Registration
- User Login Authentication
- Role-Based Access Control (Admin/User)
- CRUD Operations for Users
- DTO-Based Request and Response Handling
- Input Validation
- Global Exception Handling
- RESTful API Design
- API Testing with Postman

## Tech Stack
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## Project Structure
src/main/java
└── com.palle
    ├── controller
    │   └── UserController.java
    ├── dto
    │   └── UserDTO.java
    ├── entity
    │   └── User.java
    ├── repository
    │   └── UserRepository.java
    ├── service
    │   └── UserService.java
    ├── userexception
    │   └── UserException.java
    └── SbUserManagementProjectApplication.java

src/main/resources
├── static
├── templates
└── application.properties

## Authentication Flow
1. User registers with required details.
2. User logs in using valid credentials.
3. Spring Security authenticates the user.
4. Access to protected endpoints is granted based on user role (Admin/User).

## API Endpoints
### User Management
- GET /getAllUsers → Get all users
- GET /getOneUser/{id} → Get user by ID
- POST /insertUser → Create user
- PUT /updateUser/{id} → Update user
- DELETE /deleteUser/{id} → Delete user

## Validation and Exception Handling
- Implemented request validation using @Valid
- Added custom validation rules for user input
- Centralized exception handling using @ControllerAdvice
- Returned structured error responses for invalid requests

## How to Run

1. Clone the repository
2. Open the project in STS / IntelliJ / Eclipse
3. Configure MySQL in application.properties
4. Create database in MySQL
5. Run the application
6. Test endpoints using Postman

```bash
git clone https://github.com/sharathchikkagoudra/user-management-system.git
cd user-management-system
mvn spring-boot:run
