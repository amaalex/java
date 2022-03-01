## Problem Description
  - :heavy_check_mark: Create a class that describes an instance of the problem.
  - :heavy_check_mark: Override the equals method form the Object class for the Event, Room classes. The problem should not allow adding the same event or room twice.
  - :heavy_check_mark: Instead of using an enum, create dedicated classes for lecture halls and computer labs. Room will become abstract. The course room may have an additional property indicating if there is a video projector, and the lab room may indicate the operating system of its computers.
 
  - ✔️: Create a class to describe the solution.
  - ✔️: Implement a simple algorithm for creating a feasible solution to the problem, "trying" to minimize the number of used rooms.
  - ✔️: Write doc comments in your source code and generate the class documentation using javadoc.


## Input Used:
  ```java
        Problem p1 = new Problem("P1");

        p1.addEvent(new Event("C1", 100, 8, 10));
        p1.addEvent(new Event("C2", 100, 10, 12));
        p1.addEvent(new Event("l1", 30, 8, 10));
        p1.addEvent(new Event("l2", 30, 8, 10));
        p1.addEvent(new Event("l3", 30, 10, 12));
        p1.addEvent(new Event("l3", 30, 10, 12)); // duplicate

        p1.addRoom(new Lab("401", 30, "Windows"));
        p1.addRoom(new Lab("401", 30, "Windows")); // duplicate
        p1.addRoom(new Lab("403", 30, "Ubuntu"));
        p1.addRoom(new Lab("405", 30, "MacOS"));
        p1.addRoom(new LectureHall("309", 100, Boolean.TRUE));
        p1.addRoom(new LectureHall("309", 100, Boolean.TRUE)); // duplicate
  ```

## Output
![image](https://user-images.githubusercontent.com/61457770/156240194-e66305b5-0279-4339-aaff-e33e542d41bf.png)
