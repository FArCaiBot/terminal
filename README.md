# Spring Boot Project - Bus Station Management

This is an example of a REST API in Java/Maven/Spring Boot (3.2.0) that can be used for the management of information
for a bus station.

## How to Run
This application is packaged as a jar which has Tomcat 8 embedded. No Tomcat or JBoss installation is necessary. You run it using the ```java -jar``` command.

* Clone this repository
* Make sure you are using JDK 17 and Maven 3.x
* You can build the project and run the tests by running ```mvn clean package```
* Check the stdout or boot_example.log file to make sure no exceptions are thrown

Once the application runs you should see something like this
```
2017-08-29 17:31:23.091  INFO 19387 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8090 (http)
2017-08-29 17:31:23.097  INFO 19387 --- [           main] com.khoubyari.example.Application        : Started Application in 22.285 seconds (JVM running for 23.032)
```
