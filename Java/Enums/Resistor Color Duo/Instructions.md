# Resistor Color Codes Decoder

If you're working with a Raspberry Pi and using resistors, you'll often encounter resistors with color-coded bands to denote their resistance values. This exercise involves creating a program to decipher the resistance value from the color bands.

The first two bands of a resistor have a simple encoding scheme, where each color maps to a single number. For instance, if the bands are brown (value 1) followed by green (value 5), it translates to the number 15.

Here's the encoding for each band color:

- Black: 0
- Brown: 1
- Red: 2
- Orange: 3
- Yellow: 4
- Green: 5
- Blue: 6
- Violet: 7
- Grey: 8
- White: 9

The goal of the program is to take color names as input and output a two-digit number, even if the input includes more than two colors. For example, brown-green should return 15, and brown-green-violet should also return 15, ignoring the third color.