# Implementation-course-algaworks: (Fullstack Angular e Spring).

This document contains the backend development carried out during the [algaworks](https://www.algaworks.com/) Fullstack course.

What is a REST and its fundamentals, how can we represent a resource, how to make queries and API entries, what should we return in a query that returns an empty collection?, Use Bean Validation and etc.

# Technologies and Prerequisites
* Java 11
* Maven 4.0.0
* Spring Tool Suite – Version 4.1.1.RELEASE
* Spring Boot: 2.1.2.RELEASE
* Installing and Step to do
* Create Spring Boot project & add Dependencies
* Configure Spring JPA

# Installing and Step to do
* Create Spring Boot project & add Dependencies for Spring Boot and MySQL in **pom.xml**
* Configure Spring JPA

# Class and Interfaces and methods

 * **Model:**
    - Pessoa
    - Endereco
    - Categoria 
    - Lancamento
    - TipoLancamento
  
 * **Repository:**
    - Interface “EmployeeRepository”

 * **Controller:**
    - Create the interface public interface LancamentoRepositoryQuery 
    - Create the class LancamentoRepositoryImpl implements LancamentoRepositoryQuery
  
* **Configuration for Spring Datasource and Spring JPA properties** 
    - application.properties
* **Create MySQL table**
* **Run Spring Boot Application & Enjoy Result**


# Configuration for Spring Datasource & JPA properties
```
spring.datasource.url=jdbc:mysql://localhost:3306/nomeDoBanco?useSSL=false
spring.datasource.username=root
spring.datasource.password=abcxyz
spring.jpa.generate-ddl=true
```

# Our Spring Boot Server can work with MySQL Database and provides APIs:
```  
E.g http://localhost:8080/pessoas
  
GET /api/pessoas/: get all pessoas
GET /api/pessoas/{id}: get a pessoa id
GET /api/categorias/: get all categorias
GET /api/categorias/{id}: get a categoria id
GET /api/lancamentos/: get all lancamentos
GET /api/lancamentos/{id}: get a lancamento id

POST /api/pessoas: save a pessoa
POST /api/categorias: save a categoria
POST /api/lancamentos: save a lancamento

PUT /api/pessoas/{id}/ativo: update a pessoa id estatus if true or false

DELETE  /api/lancamentos/{id}: delete a lancamento id
```  

# Preparing the environment
  Spring Boot requires the following items:
* The [JDK](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html) is the development kit for Java applications.

* The [Maven](https://maven.apache.org/download.cgi) which is the Java package manager. Maven comes down to reading the "pom.xml" file and synchronizing the dependencies your project uses. For example, if you need to use the Oracle adapter to connect to the database, it will be in pom.xml that we will add this dependency and the IDE will download all packages automatically. To install Maven, simply download, unzip somewhere in the system and add your path in the PATH environment variables,

* The [IDE](https://spring.io/tools) that has several facilities for the development of Spring Boot applications. We will use the STS (Spring Tool Suite), which is a modified Eclipse for Spring Boot. The download is right here. Just download and run ".exe"

# Database

* In this application uses MySql. You can only install MySql Server on the system, being accessible through the command line (shell). To install MySql, go to this [link](https://dev.mysql.com/downloads/installer/).
