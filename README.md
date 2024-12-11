# Snakes and Ladders Game

This project implements a **Snakes and Ladders** game in Java. Players roll dice to move across the board, encountering snakes and ladders that affect their progress. The goal is to reach the last position on the board before other players.

## Features
- **Dynamic Game Setup:** The game board size, number of players, and number of dice are configurable by the user.
- **Random Dice Rolls:** Each player rolls dice to determine how far they will move. The dice can be configured to roll multiple dice at once.
- **Snakes and Ladders:** The game includes various snakes and ladders, which move players backward (snake) or forward (ladder) on the board.
- **Game Flow:** Players take turns rolling dice, moving on the board, and interacting with snakes or ladders. The first player to reach the last position on the board wins.
- **Player Tracking:** Players are tracked by their names and positions on the board.

## Classes Overview
1. **Mover (Abstract class)**: A base class for all game movers (snakes and ladders). Each mover has a start and end position.
2. **Snake (Subclass of Mover)**: Represents a snake that moves a player back to a lower position.
3. **Ladder (Subclass of Mover)**: Represents a ladder that moves a player up to a higher position.
4. **Player**: Represents each player with a name, ID, and current position on the board.
5. **Dice**: Handles the rolling of dice and returns the total rolled.
6. **Board**: Represents the game board, stores snakes and ladders, and determines final positions based on player moves.
7. **Game**: The core game class that manages the game state, players, turns, and checks for winners.

## How to Play

1. The user is prompted to input the following details:
   - Size of the board (e.g., 100)
   - Number of players
   - Names of the players
   - Number of dice to roll

2. The game begins with each player rolling the dice and moving based on the roll. Players encounter snakes or ladders that either decrease or increase their position on the board.

3. The game continues until a player reaches the final position on the board. The first player to do so wins the game.

## Example

Here’s an example of the game flow for a board of size 100, 3 players, and 2 dice being rolled each turn:


Enter the size of the board (e.g., 100): 100
Enter the number of players: 3
Enter name for player 1: ganesh
Enter name for player 2: dinesh
Enter name for player 3: jassu
Enter the number of dice to roll: 2
Game started!

ganesh's turn.
ganesh rolled a 2.
Current Position: 1, Rolled: 2, Tentative New Position: 3
ganesh moves to position 3

dinesh's turn.
dinesh rolled a 6.
Current Position: 1, Rolled: 6, Tentative New Position: 7
dinesh moves to position 7

jassu's turn.
jassu rolled a 9.
Current Position: 1, Rolled: 9, Tentative New Position: 10
jassu moves to position 10

ganesh's turn.
ganesh rolled a 4.
Current Position: 3, Rolled: 4, Tentative New Position: 7
ganesh moves to position 7

dinesh's turn.
dinesh rolled a 10.
Current Position: 7, Rolled: 10, Tentative New Position: 17
dinesh moves to position 17

jassu's turn.
jassu rolled a 10.
Current Position: 10, Rolled: 10, Tentative New Position: 20
jassu moves to position 20

ganesh's turn.
ganesh rolled a 2.
Current Position: 7, Rolled: 2, Tentative New Position: 9
ganesh moves to position 9

dinesh's turn.
dinesh rolled a 9.
Current Position: 17, Rolled: 9, Tentative New Position: 26
dinesh moves to position 26

jassu's turn.
jassu rolled a 9.
Current Position: 20, Rolled: 9, Tentative New Position: 29
jassu moves to position 29

ganesh's turn.
ganesh rolled a 8.
Current Position: 9, Rolled: 8, Tentative New Position: 17
ganesh moves to position 17

dinesh's turn.
dinesh rolled a 11.
Current Position: 26, Rolled: 11, Tentative New Position: 37
dinesh moves to position 37

jassu's turn.
jassu rolled a 7.
Current Position: 29, Rolled: 7, Tentative New Position: 36
jassu moves to position 36

ganesh's turn.
ganesh rolled a 9.
Current Position: 17, Rolled: 9, Tentative New Position: 26
ganesh moves to position 26

dinesh's turn.
dinesh rolled a 6.
Current Position: 37, Rolled: 6, Tentative New Position: 43
dinesh moves to position 43

jassu's turn.
jassu rolled a 8.
Current Position: 36, Rolled: 8, Tentative New Position: 44
jassu moves to position 44

ganesh's turn.
ganesh rolled a 4.
Current Position: 26, Rolled: 4, Tentative New Position: 30
ganesh moves to position 30

dinesh's turn.
dinesh rolled a 9.
Current Position: 43, Rolled: 9, Tentative New Position: 52
dinesh moves to position 52

jassu's turn.
jassu rolled a 10.
Current Position: 44, Rolled: 10, Tentative New Position: 54
jassu moves to position 54

ganesh's turn.
ganesh rolled a 7.
Current Position: 30, Rolled: 7, Tentative New Position: 37
ganesh moves to position 37

dinesh's turn.
dinesh rolled a 5.
Current Position: 52, Rolled: 5, Tentative New Position: 57
dinesh moves to position 57

jassu's turn.
jassu rolled a 11.
Current Position: 54, Rolled: 11, Tentative New Position: 65
jassu moves to position 65

ganesh's turn.
ganesh rolled a 7.
Current Position: 37, Rolled: 7, Tentative New Position: 44
ganesh moves to position 44

dinesh's turn.
dinesh rolled a 6.
Current Position: 57, Rolled: 6, Tentative New Position: 63
dinesh moves to position 63

jassu's turn.
jassu rolled a 8.
Current Position: 65, Rolled: 8, Tentative New Position: 73
jassu moves to position 73

ganesh's turn.
ganesh rolled a 3.
Current Position: 44, Rolled: 3, Tentative New Position: 47
ganesh moves to position 47

dinesh's turn.
dinesh rolled a 9.
Current Position: 63, Rolled: 9, Tentative New Position: 72
dinesh moves to position 72

jassu's turn.
jassu rolled a 5.
Current Position: 73, Rolled: 5, Tentative New Position: 78
jassu moves to position 78

ganesh's turn.
ganesh rolled a 5.
Current Position: 47, Rolled: 5, Tentative New Position: 52
ganesh moves to position 52

dinesh's turn.
dinesh rolled a 4.
Current Position: 72, Rolled: 4, Tentative New Position: 76
dinesh moves to position 76

jassu's turn.
jassu rolled a 4.
Current Position: 78, Rolled: 4, Tentative New Position: 82
jassu moves to position 82

ganesh's turn.
ganesh rolled a 7.
Current Position: 52, Rolled: 7, Tentative New Position: 59
ganesh moves to position 59

dinesh's turn.
dinesh rolled a 11.
Current Position: 76, Rolled: 11, Tentative New Position: 87
dinesh moves to position 87

jassu's turn.
jassu rolled a 7.
Current Position: 82, Rolled: 7, Tentative New Position: 89
jassu moves to position 89

ganesh's turn.
ganesh rolled a 2.
Current Position: 59, Rolled: 2, Tentative New Position: 61
ganesh moves to position 61

dinesh's turn.
dinesh rolled a 6.
Current Position: 87, Rolled: 6, Tentative New Position: 93
dinesh moves to position 93

jassu's turn.
jassu rolled a 9.
Current Position: 89, Rolled: 9, Tentative New Position: 98
jassu moves to position 77

ganesh's turn.
ganesh rolled a 8.
Current Position: 61, Rolled: 8, Tentative New Position: 69
ganesh moves to position 69

dinesh's turn.
dinesh rolled a 6.
Current Position: 93, Rolled: 6, Tentative New Position: 99
dinesh moves to position 99

jassu's turn.
jassu rolled a 10.
Current Position: 77, Rolled: 10, Tentative New Position: 87
jassu moves to position 87

ganesh's turn.
ganesh rolled a 8.
Current Position: 69, Rolled: 8, Tentative New Position: 77
ganesh moves to position 77

dinesh's turn.
dinesh rolled a 5.
Current Position: 99, Rolled: 5, Tentative New Position: 104
dinesh stays at 99 (roll exceeds board size).

jassu's turn.
jassu rolled a 6.
Current Position: 87, Rolled: 6, Tentative New Position: 93
jassu moves to position 93

ganesh's turn.
ganesh rolled a 9.
Current Position: 77, Rolled: 9, Tentative New Position: 86
ganesh moves to position 86

dinesh's turn.
dinesh rolled a 8.
Current Position: 99, Rolled: 8, Tentative New Position: 107
dinesh stays at 99 (roll exceeds board size).

jassu's turn.
jassu rolled a 8.
Current Position: 93, Rolled: 8, Tentative New Position: 101
jassu stays at 93 (roll exceeds board size).

ganesh's turn.
ganesh rolled a 6.
Current Position: 86, Rolled: 6, Tentative New Position: 92
ganesh moves to position 92

dinesh's turn.
dinesh rolled a 6.
Current Position: 99, Rolled: 6, Tentative New Position: 105
dinesh stays at 99 (roll exceeds board size).

jassu's turn.
jassu rolled a 9.
Current Position: 93, Rolled: 9, Tentative New Position: 102
jassu stays at 93 (roll exceeds board size).

ganesh's turn.
ganesh rolled a 8.
Current Position: 92, Rolled: 8, Tentative New Position: 100
ganesh moves to position 100

ganesh wins the game!

Game Over! Thanks for playing.



