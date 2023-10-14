# Resistor Color Code Decoder

If you want to build something using a Raspberry Pi, you'll probably use resistors. For this exercise, you need to know two things about them:

1. Each resistor has a resistance value.
2. Resistors are small - so small in fact that if you printed the resistance value on them, it would be hard to read.

To get around this problem, manufacturers print color-coded bands onto the resistors to denote their resistance values. Each band has a position and a numeric value.

The first 2 bands of a resistor have a simple encoding scheme: each color maps to a single number.

In this exercise, you are going to create a helpful program so that you don't have to remember the values of the bands.

### Color Mapping

These colors are encoded as follows:

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

### Exercise Goals

The goal of this exercise is to create a way:

- To look up the numerical value associated with a particular color band.
- To list the different band colors.

### Mnemonics

Mnemonics map the colors to the numbers, that, when stored as an array, happen to map to their index in the array: **B**etter **B**e **R**ight **O**r **Y**our **G**reat **B**ig **V**alues **G**o **W**rong.

More information on the color encoding of resistors can be found in the [Electronic color code Wikipedia article](https://en.wikipedia.org/wiki/Electronic_color_code).
