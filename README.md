# Student Management System

A full-stack web application developed using Spring Boot to manage student records efficiently. The application allows users to perform complete CRUD (Create, Read, Update, Delete) operations through a simple and responsive web interface.

## Features

* Add new student records
* View all students in a structured table
* Update existing student details
* Delete student records
* Responsive and user-friendly UI using Bootstrap
* MVC architecture implementation

## Technologies Used

### Backend

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate

### Frontend

* HTML5
* Bootstrap
* Thymeleaf

### Database

* MySQL

### Build Tool

* Maven

## Project Architecture

```
Controller
    ↓
Service
    ↓
Repository
    ↓
Database (MySQL)
```

## Project Structure

```
src/main/java
 ├── controllers
 ├── services
 ├── serviceImpl
 ├── repositories
 └── entities
```

## Database Configuration

Create a MySQL database:

```
Student_DB
```

Configure your `application.properties` file with your own database credentials.

## Screenshots

### Student List Page
https://github.com/Suraj00021/StudentManagementSystem/blob/main/screenshots/student-list.png

### Add Student Page

https://github.com/Suraj00021/StudentManagementSystem/blob/main/screenshots/add-student.png

### Update Student Page

https://github.com/Suraj00021/StudentManagementSystem/blob/main/screenshots/update-student.png

### Delete Student Page

https://github.com/Suraj00021/StudentManagementSystem/blob/main/screenshots/delete-student.png

## How to Run the Project

1. Clone the repository.
2. Create the MySQL database `Student_DB`.
3. Configure `application.properties`.
4. Run the Spring Boot application.
5. Open the browser and visit:

```
http://localhost:8080/students
```

## Future Enhancements

* Search student by name
* Pagination and sorting
* Form validation
* Exception handling
* Login and authentication

## Author

Suraj Sharma

B.Tech Electronics & Communication Engineering

Aspiring Java Full Stack Developer
