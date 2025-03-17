
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

Access the API:
The API will be available at http://localhost:8080.

#API Endpoints#
##Create a Training Center (POST)##
Endpoint: /trainingcenters/trainingcnter/create
Method: POST
Request Body (JSON):
{
  "centerName": "Example Center",
  "centerCode": "EXMPL1234567",
  "address": {
    "detailedAddress": "123 Main St",
    "city": "Anytown",
    "state": "CA",
    "pinCode": "123456"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Python"],
  "contactEmail": "[email address removed]",
  "contactPhone": "1234567890"
}
centerName (text): Less than 40 characters.
centerCode (text): Exactly 12 character alphanumeric.
address (object):
detailedAddress
city
state
pinCode
studentCapacity (number)
coursesOffered (List<text>)
contactEmail (text): If present, email should be validated.
contactPhone (text): Phone number validation.

## Get Training center (GET) ##

Method: GET
Query Parameters (Optional):
Endpoint: /trainingcenters/search
centerName: Filter by center name (partial match).
centerCode: Filter by center code (exact match).
detailedAddress: Filter by detailed address (partial match).
city: Filter by city (exact match).
state: Filter by state (exact match).
pincode: Filter by pincode (exact match).
studentCapacity: Filter by student capacity (exact match).
studentCapacityGreaterThan: Filter by student capacity greater than.
studentCapacityLessThan: Filter by student capacity less than.
courseOffered: Filter by course offered (exact match).
createdOn: Filter by creation time (exact match).
createdOnGreaterThan: Filter by creation time greater than.
createdOnLessThan: Filter by creation time less than.
contactEmail: Filter by contact email (partial match).
contactPhone: Filter by contact phone (exact match).
