# Dungeons & Dragons Character Generator

For a game of Dungeons & Dragons, each player starts by generating a character with six abilities: strength, dexterity, constitution, intelligence, wisdom, and charisma. These abilities are determined by rolling four 6-sided dice and recording the sum of the largest three dice. The process is repeated six times, once for each ability.

The character's initial hitpoints are calculated as 10 + the character's constitution modifier. The constitution modifier is found by subtracting 10 from the character's constitution, dividing by 2, and rounding down.

Below is an example of six throws of four dice along with the resulting abilities:

1. **Strength:**
   - Dice rolls: 5, 3, 1, 6
   - Discard the 1 and sum the remaining: 5 + 3 + 6 = 14

2. **Dexterity:**
   - Dice rolls: 3, 2, 5, 3
   - Discard the 2 and sum the remaining: 3 + 5 + 3 = 11

3. **Constitution:**
   - Dice rolls: 1, 1, 1, 1
   - Discard the 1 and sum the remaining: 1 + 1 + 1 = 3

4. **Intelligence:**
   - Dice rolls: 2, 1, 6, 6
   - Discard the 1 and sum the remaining: 2 + 6 + 6 = 14

5. **Wisdom:**
   - Dice rolls: 3, 5, 3, 4
   - Discard the 3 and sum the remaining: 5 + 3 + 4 = 12

6. **Charisma:**
   - Dice rolls: 6, 6, 6, 6
   - Discard the 6 and sum the remaining: 6 + 6 + 6 = 18

Because constitution is 3, the constitution modifier is -4, and the hitpoints are 6.

**Notes:**
- Most programming languages feature (pseudo-)random generators, but few programming languages are designed to roll dice. One such language is Troll.
  
**Source:**
Simon Shine, Erik Schierboom