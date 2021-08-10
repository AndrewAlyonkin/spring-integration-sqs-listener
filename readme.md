Stack: 
 - Java 11, Docker;  
 - Amazon Web Services SQS, RDS, SDK;
 - Spring WEB, Data JPA, Integration; 
 - MySQL;

Microservice for deploy microservices-application.   
Docker application, that is listening common AWS SQS queue, 
takes messages from it, parse them to required transfer objects and
writes to MySQL DB on AWS.
