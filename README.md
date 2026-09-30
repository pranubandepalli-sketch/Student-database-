# Student Management System

This version has NO separate SQL file and includes an `index.html` frontend.

## Stack
Java 17, Spring Boot, Spring MVC REST, JDBC/JdbcTemplate, PostgreSQL, HTML, CSS and JavaScript.

## Features
- index.html frontend
- Add student
- View students
- Edit student
- Delete student
- Search
- Data stored in PostgreSQL
- Render deployment
- No `.sql` file required

## GitHub
Upload the entire project to GitHub.

## Render
Create a Blueprint from the repository. Render reads `render.yaml`, creates the PostgreSQL database and deploys the Java application.

The database table is automatically created by `DatabaseInitializer.java`, so you do not need to upload or execute an SQL file.

## Important
This project still uses JDBC SQL statements internally because JDBC requires database queries. What is removed is the separate SQL file that you would otherwise have to run manually.
