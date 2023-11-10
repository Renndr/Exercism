# Introduction

A generator is a function or expression that returns a special type of iterator called a generator iterator. Generator-iterators are lazy and do not store values in memory but generate them when needed.

A generator function contains one or more yield expressions, each suspending code execution and saving the current state. Unlike regular functions, generators pick up state from the suspension.

## Constructing a Generator

Generators are constructed similar to other looping or recursive functions but require a yield expression. For example, a function returning squares from a list:

```python
def squares(list_of_numbers):
    squares = []
    for number in list_of_numbers:
        squares.append(number ** 2)
    return squares
```

## Converted to a generator:

```python
def squares_generator(list_of_numbers):
    for number in list_of_numbers:
        yield number ** 2
```

This is useful when values do not need to be produced all at once, saving memory and processing power.
Using a Generator

Generators can replace most iterables in Python. They can be used in for loops or with the next() function to retrieve values one by one.

```python
squared_numbers = squares_generator([1, 2, 3, 4])

for square in squared_numbers:
    print(square)
```

Values within a generator can also be produced/accessed via next():

```python
squared_numbers = squares_generator([1, 2])

next(squared_numbers)  # 1
next(squared_numbers)  # 4
```

When fully consumed, a generator-iterator throws a StopIteration error.
Note

Generator-iterators differ from regular iterators in lazy evaluation, one-way iteration, and other characteristics. They are not sortable, not sequence types, and cannot be reversed.
The yield Expression

The yield expression is similar to return but gives up values to the caller at specific points, suspending evaluation until requested. It pauses the execution of the enclosing function, returning values at that point in time.


```python
def infinite_sequence():
    current_number = 0
    while True:
        yield current_number
        current_number += 1
```

## Why Create a Generator?

Generators are memory-efficient and performant, especially with large datasets. They are helpful for working piece-by-piece, saving memory. Generators excel in handling complex, expensive, or infinite processes.


```python
def infinite_sequence():
    current_number = 0
    while True:
        yield current_number
        current_number += 1
```

Whenever __next__() is called on the infinite_sequence object, it returns the previous number + 1.

# Instructions

Conda Airlines, with over 10,000 daily flights, seeks software to automate passenger seat assignments. The software must be memory-efficient and performant to handle their extensive operations.