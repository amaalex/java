# Requirements based on discussions in the class:

- ToDo Comment and properly format the source code of your programs (otherwise: -0.5 points)
- ToDo Use the naming conventions for writing Java code. "Naming conventions make programs more understandable by making them
  easier to read." (otherwise: -0.5 points)
- ToDo Use appropriate collections in order to represent data (otherwise: -0.5 points)
- ToDo Pay attention to exception handling (otherwise: -0.5 points)
- ToDo Create your own types of exceptions to report abnormal events related to application execution.
- ToDo Organize your classes and interfaces in packages.
- ✅ ReadMe

# Problem Description

- Create all entity classes and repositories. Implement properly the one-to-many relationships.
- Create a generic AbstractRepository using generics in order to simplify the creation of the repository classes. You may take a look at the CrudRepository interface from Spring Framework.
- Insert, using JPA, a large number of cities in the database and log the execution time of your JPQL queries.
- (+1p) Assume each city has a new property, its population. Use a constraint solver, such as Choco solver, OptaPlanner or ORTools, in order to find a set of cities having names that start with the same letter, the total sum of their population is between two given bounds and they are from different countries.

# Output
