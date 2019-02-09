# meenan-java-toolbox
A toolbox of random items written in Java. This little project was created to reduce the risk associated with idle hand syndrome. :)

# Credit Where Credit Is Due
- A lot of the samples I used, especially for LDAP, are [Baeldung](https://www.baeldung.com), a fantastic resource for Java and Spring-related information and tutorials.   


# Technology Stack
- Java (http://www.oracle.com/technetwork/java/javase/overview/index.html)
- Maven (https://maven.apache.org)
- Spring Boot (https://spring.io/projects/spring-boot)
- Logback (https://logback.qos.ch)

# Prerequisites
- Java 1.8
- Maven 3.5.4

# Noteworthy Items
- Rock, Paper, Scissors is exposed as RESTful endpoints. com.mjt.games.rps.RpsController is the entry point.
- Various code challenges exist in the com.mjt.challenge package.
- Beginning to build out utils in the com.mjt.utilities package.

# To build
- `mvn package`

# To run:
- `java -jar target/meenan-java-sandbox-1.0-SNAPSHOT.jar`
- From a browser, go to `http://localhost:8080`
