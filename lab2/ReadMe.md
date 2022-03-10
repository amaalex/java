## Problem Description

- The Room Assignment Problem
- An instance of the Room Assignment Problem consists of events and rooms. Events may be courses, labs, seminars, etc. Rooms may be lecture halls, computer labs, etc.

- Each event has a name, a number of participants (its size), a start time and an end time.
- Each room has a name, a type and a capacity.
- We consider the problem of assigning a room to each event such that the constraints are satisfied and the number of used rooms is as small as possible (if possible).

- Consider the following example.
- Events: C1(size=100, start=8, end=10), C2(size=100, start=10, end=12), L1(size=30, start=8, end=10), L2(size=30, start=8, end=10), L3(size=30, start=10, end=12), 
- Rooms: 401(cap=30, lab), 403(cap=30, lab), 405(cap=30, lab), 309(cap=100, lecture hall)
- A solution may be something like that:
    - C1 -> 309
    - C2 -> 309
    - L1 -> 401
    - L2 -> 403
    - L3 -> 401

## Status of the problems

- Lab2:
    - Compulsory - ![](https://us-central1-progress-markdown.cloudfunctions.net/progress/100)
    - Homework - ![](https://us-central1-progress-markdown.cloudfunctions.net/progress/100)
    - Bonus - ![](https://us-central1-progress-markdown.cloudfunctions.net/progress/50)
