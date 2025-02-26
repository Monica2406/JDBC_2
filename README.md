# JDBC Employee Management System

## Overview
The **JDBC Employee Management System** is a Java-based application that demonstrates database connectivity using Java Database Connectivity (JDBC). It provides CRUD (Create, Read, Update, Delete) operations for managing employee records in a relational database.

## Features
- Establish a database connection using JDBC
- Perform CRUD operations on employee records
- Use DAO (Data Access Object) pattern for database interactions
- Handle exceptions and ensure database security

## Technologies Used
- Java
- JDBC API
- MySQL (or any relational database)
- Maven
- Eclipse IDE (or any Java-supported IDE)

## Project Structure
```
JDBC_2/
│── src/main/java/com/learning/JDBC_2/
│   ├── DBConnection.java  # Handles database connection
│   ├── EmployeeDAO.java  # CRUD operations for Employee entity
│   ├── EmployeeManagementApp.java  # Main application logic
│   ├── SimpleService.java  # Additional service logic
│── pom.xml  # Maven dependencies
│── src/main/resources/services/SimpleService/META-INF/services.xml  # Service configurations
```

## Prerequisites
- Install Java (JDK 8 or later)
- Install MySQL and set up a database
- Install Maven
- Configure database settings in `DBConnection.java`

## Setup & Installation
1. Clone the repository or extract the ZIP folder.
2. Open the project in Eclipse or any Java IDE.
3. Configure MySQL database and update credentials in `DBConnection.java`.
4. Build the project using Maven:
   ```sh
   mvn clean install
   ```
5. Run the application by executing `EmployeeManagementApp.java`.

## Database Configuration (JDBC Connection)
Update the following connection details in `DBConnection.java`:
```java
String url = "jdbc:mysql://localhost:3306/employee_db";
String user = "root";
String password = "password";
Connection con = DriverManager.getConnection(url, user, password);
```

## Running the Application
1. Run `EmployeeManagementApp.java` to start the application.
2. Perform CRUD operations as implemented in `EmployeeDAO.java`.
3. Verify database changes using MySQL.

## Contributing
Feel free to fork this repository and contribute by submitting pull requests.

## License
This project is licensed under the MIT License.

