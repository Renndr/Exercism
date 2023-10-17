# Dungeons & Dragons Character Generator

For a game of Dungeons & Dragons, each player generates a character with six abilities: strength, dexterity, constitution, intelligence, wisdom, and charisma. The scores for these abilities are determined randomly by rolling four 6-sided dice and recording the sum of the largest three dice. This process is repeated six times, once for each ability.

The character's initial hitpoints are calculated as 10 + the character's constitution modifier. The constitution modifier is found by subtracting 10 from the character's constitution score, dividing by 2, and rounding down.

Here's an example of six throws of four dice:

1. **Strength:** 5, 3, 1, 6. Discard the 1, sum the largest three (5 + 3 + 6 = 14).
2. **Dexterity:** 3, 2, 5, 3. Discard the 2, sum the largest three (3 + 5 + 3 = 11).
3. **Constitution:** 1, 1, 1, 1. Discard the 1, sum the largest three (1 + 1 + 1 = 3).
4. **Intelligence:** 2, 1, 6, 6. Discard the 1, sum the largest three (2 + 6 + 6 = 14).
5. **Wisdom:** 3, 5, 3, 4. Discard the 3, sum the largest three (5 + 3 + 4 = 12).
6. **Charisma:** 6, 6, 6, 6. Discard the 6, sum the largest three (6 + 6 + 6 = 18).

Since constitution is 3, the constitution modifier is -4, and the hitpoints are 6.

*Note: Most programming languages feature (pseudo-)random generators, but few programming languages are designed to roll dice. One such language is Troll.*