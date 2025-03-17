
# Training Center API

This project provides a REST API for managing training centers, as specified in the provided requirements.

## Prerequisites

Before you begin, ensure you have the following installed:

* **Java Development Kit (JDK):** Version 20 or higher.
* **Maven:** Version 3.6.0 or higher.
* **Integrated Development Environment (IDE):** IntelliJ IDEA(recommended), Eclipse, or VS Code.
* **Database:** MySQL, PostgreSQL, or H2 (for development).

## Setup Instructions

1. **Clone the Repository:**

   ```bash
   git clone [https://github.com/CHIRAG-GUPTA13/Backend_Traini8_CHIRAG_GUPTA.git](https://www.google.com/search?q=https://github.com/CHIRAG-GUPTA13/Backend_Traini8_CHIRAG_GUPTA.git)
   cd Backend_Traini8_CHIRAG_GUPTA
Update the application.properties or application.yml file in src/main/resources with your database connection details:
spring.datasource.url=jdbc:mysql://localhost:3306/[YOUR_DATABASE_NAME]
spring.datasource.username=[YOUR_DATABASE_USERNAME]
spring.datasource.password=[YOUR_DATABASE_PASSWORD]
spring.jpa.hibernate.ddl-auto=update # Or create/validate as needed

Build the Project:
mvn clean install

Run the Application:
mvn spring-boot:run

Locate the TrainingCenterApplication.java (or your main application class) file in the src/main/java directory.
Run the application as a Java application.
