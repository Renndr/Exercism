## Number to English Words

### Step 1: Basic Case (0-99)

Handle the basic case of numbers from 0 to 99. If the input is 22, the output should be 'twenty-two'. The program should complain if given a number outside the range.

```python
def number_to_words_0_to_99(number):
    # Implementation for numbers 0 to 99
    pass
```

### Extension: Speak Out Loud

If on Mac, shell out to Mac OS X's `say` program. If on Linux or Windows, use eSpeakNG.

### Step 2: Breaking into Chunks

Implement breaking a number into chunks of thousands. For example, 1234567890 should yield a list like [1, 234, 567, 890], while 1000 should yield [1, 0]. The program must report any values that are out of range.

```python
def break_into_chunks(number):
    # Implementation to break a number into chunks of thousands
    pass
```

### Step 3: Insert Scale Words

Handle inserting the appropriate scale word between the chunks. For example, 1234567890 should yield '1 billion 234 million 567 thousand 890'. The program must report any values that are out of range.

```python
def insert_scale_words(chunks):
    # Implementation to insert scale words between chunks
    pass
```

### Step 4: Final Implementation

Put it all together to get plain English words for the number. For example, 12345 should give 'twelve thousand three hundred forty-five'. The program must report any values that are out of range.

```python
def number_to_words(number):
    # Final implementation combining all steps
    pass
```

Feel free to replace the `pass` statements with the actual implementation for each step.