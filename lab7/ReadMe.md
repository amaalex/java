- Lab Status

    - Compulsory - ![](https://us-central1-progress-markdown.cloudfunctions.net/progress/100)
    - Homework - ![](https://us-central1-progress-markdown.cloudfunctions.net/progress/0)
    - Bonus - ![](https://us-central1-progress-markdown.cloudfunctions.net/progress/0)

## Problem description

Concurrency \
Write a program that simulates a word game between a given number of players.

- At the beginning of the game there is a bag containing a number of tiles. Each tile represents a letter and has a number of points. 
- The application will also use a dictionary that contains a list of acceptable words. 
- Each player extracts 7 tiles from the bag and must create a word from the dictionary with them. 
- When a player creates a word, it submits it to the board and receives a number of points (the value of tile points multiplied by the length of the word). 
- After submitting a word of length k, the player will immediately request other tiles k from the bag(if this is possible). 
- If the player cannot create a word, it will discard all the tiles and extract others (and passes its turn). The game ends when the bag becomes empty. 
- The winner is the player with the highest score.\
The players might take turns (or not...) and a time limit might be imposed (or not...). 