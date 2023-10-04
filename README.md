# Spring boot 3.x.x mandates JDK 17 or higher 

-  Prereqs: Java 18, IntelliJ/Eclipse, Git
-  SpringWebApplication - run as java app

Get home REST API:
- http://localhost:10000/springboot

Create a user REST API, I used **postman**/RestClient
- HTTP method: POST
- URL : http://localhost:10000/springboot/addUser
- Header: Content-Type: application/json
- raw Body: {"id":100, "username": "Narayana"}

Get User By ID REST API:
- http://localhost:10000/springboot/getUserById/100

Get Users REST API:
- http://localhost:10000/springboot/getUsers
