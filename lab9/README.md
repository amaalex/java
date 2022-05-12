#Requirements

<h2>
    Compulsory
</h2>
<p>
✔️Create a persistence unit (use EclipseLink or Hibernate or other JPA implementation). </br>
✔️Verify the presence of the persistence.xml file in your project. Make sure that the driver for
EclipseLink or Hibernate was added to to your project classpath (or add it yourself). </br>
✔️Define the entity classes for your model (at least one) and put them in a dedicated package. 
You may use the IDE support in order to generate entity classes from database tables. </br>
✔️Create a singleton responsible with the management of an EntityManagerFactory object. </br>
✔️Define repository clases for your entities (at least one). They must contain the following methods: </br>
- create - receives an entity and saves it into the database; </br>
- findById - returns an entity based on its primary key; </br>
- findByName - returns a list of entities that match a given name pattern. Use a named query in order
to implement this method. </br>
✔️Test your application. </br>
</p>

<h2>
    Homework
</h2>
<p>
<br>
✔️Create all entity classes and repositories. Implement properly the one-to-many relationships. </br>
✔️Create a generic AbstractRepository using generics in order to simplify the creation of the repository classes. 
You may take a look at the CrudRepository interface from Spring Framework. </br>
✔️Insert, using JPA, a large number of cities in the database and log the execution time of your JPQL queries. </br>
❎ (+1p) Assume each city has a new property, its population. Use a constraint solver, such as Choco solver, OptaPlanner or ORTools, in order to find a set of cities having names that start with the same letter, 
the total sum of their population is between two given bounds and they are from different countries.
</p>

<h2>
    Bonus
</h2>
<p>
✔️Implement properly the many-to-many sisterhood relationship. </br>
✔️Implement both the JDBC and JPA implementations and use an AbstractFactory in order to create the DAO objects (the repositories). </br>
✔️The application will use JDBC or JPA depending on a parameter given in an initialization file. </br>
❎️You may also use an IoC container in order to inject the DAO implementations. </br>
</p>