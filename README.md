REST API Automation Testing with RestAssured and TestNG
This project automates REST API testing using RestAssured, Java, and TestNG. The purpose is to validate API endpoints to ensure reliability, accuracy, and performance of the REST services. Test data is read from an external file,and the project applies the Page Object Model (POM) for cleaner, maintainable code.

Project Overview
This automation project includes:
  1.	Setting up API requests and response validations.
  2.	Using TestNG for test execution .
  3.	Using Hamcrest assertion.
  4.	Reading test data from external files for data-driven testing.
  5.	Structuring code with Page Object Model (POM) to improve modularity and readability.
     
Project Structure
  •	Programming Language: Java
  •	Frameworks & Libraries:
    o	RestAssured for REST API automation.
    o	TestNG for test execution, and reporting.
    o	Page Object Model (POM) to organize API requests and make tests modular and maintainable.
  •	IDE: IntelliJ IDEA
  •	Data Source: External file (JSON) for data-driven testing.

Prerequisites
  •	Java (JDK 8 or above)
  •	IntelliJ IDEA (or any Java-compatible IDE)
  •	Maven for dependency management

Project Components

  •	src/test/java/reqres.in/: Contains TestNG test classes for executing API tests.
  •	src/test/java/DataUtils/: Contains helper utilities, such as file readers for external data.

Test Cases
  API Test Scenarios
  1.	POST Request Validation: Sends data via POST 
  2.  Verifies the response and any data creation.





