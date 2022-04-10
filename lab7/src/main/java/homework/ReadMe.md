Time spent for Compulsory without breaks: 4 hours.

# Requirements:

- ✅ Comment and properly format the source code of your programs (otherwise: -0.5 points)
- ✅ Use the naming conventions for writing Java code. "Naming conventions make programs more understandable by making them
  easier to read." (otherwise: -0.5 points)
- ✅ Use appropriate collections in order to represent data (otherwise: -0.5 points)
- ✅ Pay attention to exception handling (otherwise: -0.5 points)
- ✅ Create your own types of exceptions to report abnormal events related to application execution.
- ✅ Organize your classes and interfaces in packages.
- ✅ ReadMe
- ✅ Logging

# Problem Description

* ✅ Use the following number of tiles for each letter: A-9, B-2, C-2, D-4, E-12, F-2, G-3, H-2, I-9, J-1, K-1, L-4, M-2, N-6, O-8, P-2, Q-1, R-6, S-4, T-6, U-4, V-2, W-2, X-1, Y-2, Z-1
* ✅ Use the following points for the letters:
  - (1 point)-A, E, I, O, U, L, N, S, T, R
  - (2 points)-D, G
  - (3 points)-B, C, M, P
  - (4 points)-F, H, V, W, Y
  - (5 points)-K
  - (8 points)- J, X
  - (10 points)-Q, Z
  
#### Pentru task-urile de mai sus am folosit citirea din fisier -> files -> tiles.txt

* ✅ Create an implementation of a dictionary, using some collection of words. Use an appropriate collection to represent the dictionary. This collection should be large enough; you may use aspell to generate a text file containing English words, or anything similar: WordNet, dexonline, etc.
#### pentru task-ul de mai sus am folosit generator de cuvinte, dependinta urmatoare: https://github.com/mdeanda/lorem


* ✅ Implement the scoring and determine who the winner is at the end of the game.
* ✅ Make sure that players wait their turns, using a wait-notify approach.
* ✅ Implement a timekeeper thread that runs concurrently with the player threads, as a daemon. This thread will display the running time of the game and it will stop the game if it exceeds a certain time limit.

####Singura validare care nu e facuta:
  - cand playerul isi ia literele, eu fac un cuvant pentru acel player din toate literele extrase in ordinea in care au fost extrase.
  - daca acel cuvant se afla in dictionar, este punctat, iar daca nu, nu.
  - ce ar fi treubuit facut suplimentar aici este ca, pornind de la 2 litere, sa fac toate combinatiile de litere posibile astfel incat sa verific daca oricum ar fi interschimbate literele gasesc un cuvant sau nu in dictionar. Lipseste un algoritm de mix de litere si verificare cu dictionarul.

# Output
![image](https://user-images.githubusercontent.com/61457770/162619319-72e415f7-1d4d-4bd4-9dc5-2d39c31274c7.png)
Points 0 pentru ca nu a fost niciun player care sa nimereasca vreun cuvant din dinctionarul format.
Am folosit date hardcodate in timp ce lucram la tema (pentru validari) si a functionat corect.
