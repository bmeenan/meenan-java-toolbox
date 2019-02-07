# meenan-java-toolbox
A toolbox of random items written in Java. This little project was created to reduce the risk associated with idle hand syndrome. :)

# Technology Stack
- Java (http://www.oracle.com/technetwork/java/javase/overview/index.html)
- Maven (https://maven.apache.org)
- Spring Boot (https://spring.io/projects/spring-boot)
- Logback (https://logback.qos.ch)

# Prerequisites:
- Java 1.8
- Maven 3.5.4

# Noteworthy Items
- Rock, Paper, Scissors is exposed as RESTful endpoints. com.bmeenan.games.rps.RpsController is the entry point.
- Various code challenges exist in the com.bmeenan.challenge package.
- Beginning to build out utils in the com.bmeenan.utilities package.

# To build:
- `mvn package`

# To run:
- `java -jar target/meenan-java-sandbox-1.0-SNAPSHOT.jar`
- From a browser, go to `http://localhost:8080`
