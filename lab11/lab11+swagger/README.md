
#Compulsory

✔️ Create a Spring Boot project containing the REST services 
for comunicating with the database. </br>
✔️ Create a REST controller containing methods for: </br>
<p>
- obtaining the list of the persons, via a HTTP GET request. </br>
- adding a new person, via a HTTP POST request. </br>
- modifying the name of a person, via a HTTP PUT request. </br>
- deleting a person, via a HTTP DELETE request. </br>
</p>
✔️ Test your services using the browser and/or Postman. </br>

#Homework
✔️ Create REST services for inserting and reading relationships. </br>
✔️ Create a service for determining the first k most popular persons in the network. </br>
✔️ Create a simple client application that invokes the services above, 
using the support offered by Spring Boot. </br>
✔️ Document your services using Swagger or a similar tool. </br>
✔️ (+1p) Secure your services using the HTTPS protocol and JSON Web Tokens </br>

#Bonus
✔️ Write a service that determines in linear time all 
persons who are so important to the social network such that,
if one of them were eliminated, the network would
become disconnected. </br>
❎ Create a simple desktop application that sends multiple concurrent invocations to the service above, in order to determine how many API requests per minute your service can handle.
You may also monitor other performance metrics, using your own implementation or Spring support.