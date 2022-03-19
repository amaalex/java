## Problem Description

  - ✔️ Create a Maven project.
  <p align="center"><img src="https://user-images.githubusercontent.com/61457770/159121016-0f43e59b-a507-4ae9-947e-b77cc0a7dace.png" width=15% height=15%></p>

  - ✔️ Create an object-oriented model of the problem. Streets have names and lengths, intersections have names. A street joins two intersections.
  - ✔️ Create the streets and the intersections of the problem described in the example. Use streams in order to easily create the intersections.
  - ✔️ Create a list of streets, using LinkedList implementation and sort it by the length, using a comparator expressed as a lambda-expression or method reference. Make sure all the objects are comparable.
  - ✔️ Create a set of intersections, using a HashSet implementation. Verify the property that a Set does not contain duplicates.

## Output as image
![image](https://user-images.githubusercontent.com/61457770/159121033-ca0943f3-8064-42d4-93b4-6331ad63d05e.png)

## Output as text

```
(Displaying the streets before sorting)
===================
Street{name='Street1', length=2, join={I1=I1, I2=I2}}
Street{name='Street2', length=2, join={I1=I1, I2=I3}}
Street{name='Street3', length=2, join={I1=I1, I2=I4}}
Street{name='Street4', length=2, join={I1=I2, I2=I3}}
Street{name='Street5', length=3, join={I1=I2, I2=I5}}
Street{name='Street6', length=1, join={I1=I3, I2=I4}}
Street{name='Street7', length=2, join={I1=I3, I2=I6}}
Street{name='Street8', length=2, join={I1=I3, I2=I7}}
Street{name='Street9', length=3, join={I1=I4, I2=I6}}
Street{name='Street10', length=1, join={I1=I5, I2=I6}}
Street{name='Street11', length=1, join={I1=I5, I2=I8}}
Street{name='Street12', length=2, join={I1=I5, I2=I9}}
Street{name='Street13', length=3, join={I1=I6, I2=I9}}
Street{name='Street14', length=1, join={I1=I7, I2=I8}}
Street{name='Street15', length=1, join={I1=I7, I2=I9}}
Street{name='Street16', length=1, join={I1=I8, I2=I9}}

(Displaying the streets after sorting using Comparator)
===================
Street{name='Street6', length=1, join={I1=I3, I2=I4}}
Street{name='Street10', length=1, join={I1=I5, I2=I6}}
Street{name='Street11', length=1, join={I1=I5, I2=I8}}
Street{name='Street14', length=1, join={I1=I7, I2=I8}}
Street{name='Street15', length=1, join={I1=I7, I2=I9}}
Street{name='Street16', length=1, join={I1=I8, I2=I9}}
Street{name='Street1', length=2, join={I1=I1, I2=I2}}
Street{name='Street2', length=2, join={I1=I1, I2=I3}}
Street{name='Street3', length=2, join={I1=I1, I2=I4}}
Street{name='Street4', length=2, join={I1=I2, I2=I3}}
Street{name='Street7', length=2, join={I1=I3, I2=I6}}
Street{name='Street8', length=2, join={I1=I3, I2=I7}}
Street{name='Street12', length=2, join={I1=I5, I2=I9}}
Street{name='Street5', length=3, join={I1=I2, I2=I5}}
Street{name='Street9', length=3, join={I1=I4, I2=I6}}
Street{name='Street13', length=3, join={I1=I6, I2=I9}}

(Displaying the intersections with streets assigned (using Streams))
===================
Intersection{name='I7', streets=[Street{name='Street8', length=2, join={I1=I3, I2=I7}}, Street{name='Street14', length=1, join={I1=I7, I2=I8}}, Street{name='Street15', length=1, join={I1=I7, I2=I9}}]}
Intersection{name='I8', streets=[Street{name='Street11', length=1, join={I1=I5, I2=I8}}, Street{name='Street14', length=1, join={I1=I7, I2=I8}}, Street{name='Street16', length=1, join={I1=I8, I2=I9}}]}
Intersection{name='I5', streets=[Street{name='Street11', length=1, join={I1=I5, I2=I8}}, Street{name='Street5', length=3, join={I1=I2, I2=I5}}, Street{name='Street12', length=2, join={I1=I5, I2=I9}}, Street{name='Street10', length=1, join={I1=I5, I2=I6}}]}
Intersection{name='I6', streets=[Street{name='Street9', length=3, join={I1=I4, I2=I6}}, Street{name='Street13', length=3, join={I1=I6, I2=I9}}, Street{name='Street7', length=2, join={I1=I3, I2=I6}}, Street{name='Street10', length=1, join={I1=I5, I2=I6}}]}
Intersection{name='I3', streets=[Street{name='Street6', length=1, join={I1=I3, I2=I4}}, Street{name='Street8', length=2, join={I1=I3, I2=I7}}, Street{name='Street7', length=2, join={I1=I3, I2=I6}}, Street{name='Street4', length=2, join={I1=I2, I2=I3}}, Street{name='Street2', length=2, join={I1=I1, I2=I3}}]}
Intersection{name='I4', streets=[Street{name='Street6', length=1, join={I1=I3, I2=I4}}, Street{name='Street9', length=3, join={I1=I4, I2=I6}}, Street{name='Street3', length=2, join={I1=I1, I2=I4}}]}
Intersection{name='I1', streets=[Street{name='Street3', length=2, join={I1=I1, I2=I4}}, Street{name='Street2', length=2, join={I1=I1, I2=I3}}, Street{name='Street1', length=2, join={I1=I1, I2=I2}}]}
Intersection{name='I2', streets=[Street{name='Street5', length=3, join={I1=I2, I2=I5}}, Street{name='Street4', length=2, join={I1=I2, I2=I3}}, Street{name='Street1', length=2, join={I1=I1, I2=I2}}]}


```
