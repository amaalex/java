# Requirements based on discussions in the class:

- ✅ Comment and properly format the source code of your programs (otherwise: -0.5 points)
- ✅ Use the naming conventions for writing Java code. "Naming conventions make programs more understandable by making them
  easier to read." (otherwise: -0.5 points)
- ✅ Use appropriate collections in order to represent data (otherwise: -0.5 points)
- N/A Pay attention to exception handling (otherwise: -0.5 points)
- N/A Create your own types of exceptions to report abnormal events related to application execution.
- ✅ Organize your classes and interfaces in packages.
- ✅ ReadMe

# Problem Description

- ✅ Create a persistence unit (use EclipseLink or Hibernate or other JPA implementation).
- ✅ Verify the presence of the persistence.xml file in your project. Make sure that the driver for EclipseLink or Hibernate was added to to your project classpath (or add it yourself).
- ✅ Define the entity classes for your model (at least one) and put them in a dedicated package. You may use the IDE support in order to generate entity classes from database tables.
- ✅ Create a singleton responsible with the management of an EntityManagerFactory object.
- ✅ Define repository clases for your entities (at least one). They must contain the following methods:
  - create - receives an entity and saves it into the database;
  - findById - returns an entity based on its primary key;
  - findByName - returns a list of entities that match a given name pattern. Use a named query in order to implement this method.
- Test your application.

# Output
