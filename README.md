# To-Do List API using Java and Spring Framework with MySQL

This is a simple To-Do List API developed using Java and the Spring Framework. The API allows users to perform basic CRUD (Create, Read, Update, Delete) operations on tasks. The tasks are stored in a MySQL database, making the data persistent.

## To set up and run the To-Do List API on your local machine, follow these steps:

## Prerequisites

1. Java Development Kit (JDK) - Ensure you have Java installed on your system.
2. Spring Boot - The project uses Spring Boot to simplify configuration. You can include Spring Boot in your project or use Spring Initializr to create a new one.
3. MySQL Database - Install MySQL and set up a database for the API.

## Installing
  1. Clone the repository or download the source code to your local machine.

  2. Import the project into your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).

  3. Set up the MySQL database and create a new schema for the API.
     
  5. Configure the database connection in the application.properties file located in the src/main/resources directory. Update the following properties with your MySQL credentials:
       spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
      spring.datasource.username=your_mysql_username
      spring.datasource.password=your_mysql_password

   6. Run the application. This will start the embedded Tomcat server and deploy the API.

## API Endpoints

The API provides the following endpoints to manage tasks:

1. GET /api/tasks: Fetch all tasks.
2. GET /api/tasks/{id}: Fetch a specific task by ID.
3. POST /api/tasks: Create a new task.
4. PUT /api/tasks/{id}: Update an existing task by ID.
5. DELETE /api/tasks/{id}: Delete a task by ID.


