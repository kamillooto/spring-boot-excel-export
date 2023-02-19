# spring-boot-excel-export

This project provides a Java-based solution for exporting data from a MySQL database to an Excel file using the Apache POI library.
App uses simple databese with one table with rows initialized in CourseConfig class.

## Getting Started

These instructions will help you set up and use the spring-boot-excel-export.

### Used technologies

- Java
- Maven
- Spring Boot
- MySQL
- Apache POI

### Installing

1.  Clone the repository: `git clone https://github.com/kamillooto/spring-boot-excel-export.git`
2.  Navigate to the project directory.
3.  Update the connection details to your MySQL database in the `application.properties` file.
4.  Run the project

The app will be running on `http://localhost:8080/`

## App Endpoints

The spring-boot-excel-export app has the following endpoints:

-   `GET /excel`: Download .xls file
