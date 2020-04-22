# Contact Management
A Simple Contact management Application implemented using Spring Boot &amp; Spring Data JPA 

This Application is built Using Spring boot ,  Spring Data JPA , Hibernate Validator.It doesn't concentrate much on UI part.

This Application UI part is built using jsp,HTML,CSS,JavaScript

It uses only three tables 

Contact       - to Store User's contact information like name ,last name, Email id,phone number,status of contact.<br>               
As part of Spring MVC , this application implements
 - Request Mapping using annotations and usage of Controller,Repository annotations
 - Front End Forms to Back End DataBinding
 - Autowiring of required objects
 - JPA custom Queries<br>
 
As part of Hibernate Validator, this application implements
 - Null check , length check using annotations<br>
 
 As part of Spring Data JPA 
 - Usage of CRUD repository 
 - Usage of findBy and delete methods using different name patterns<br>
 
As part of Hibernate ORM
  - Usage of Entity , ID annotations
  - Usage of Query and Param annotations while using JPQL 
  - Usage of Transactional annotations while deleteby pattern methods <br>

 
Database:
In order to have easy development , created branch h2_database which uses in memory h2 database .

 
 References:
 
 https://stackoverflow.com/questions/44170533/

 How to Run:
 
 Method 1 Using STS IDE:
 - Import the Application contact on your STS IDE.
 - Do mvn install and build the Application.
 - Right click on project and run as Springboot Application.
 - Go to the browser hit URL:http://localhost:8080/

 Method 2 run using command line:
 - Go to Application contact where POM is located.
 - Open command line.
 - Do mvn 'install -DskipTests' to build the application
 - Run this command 'mvn spring-boot:run' from the same folder
 - Go to the browser hit URL:http://localhost:8080/

 
s