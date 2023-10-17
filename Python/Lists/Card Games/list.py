"""Functions for tracking poker hands and assorted card tasks.

Python list documentation: https://docs.python.org/3/tutorial/datastructures.html
"""

def get_rounds(number):
    """Create a list containing the current and next two round numbers.

    :param number: int - current round number.
    :return: list - current round and the two that follow.
    """
    number2 = number + 1
    number3 = number + 2
    return [number,number2,number3]

def concatenate_rounds(rounds_1, rounds_2):
    """Concatenate two lists of round numbers.

    :param rounds_1: list - first rounds played.
    :param rounds_2: list - second set of rounds played.
    :return: list - all rounds played.
    """
    return rounds_1 + rounds_2

def list_contains_round(rounds, number):
    """Check if the list of rounds contains the specified number.

    :param rounds: list - rounds played.
    :param number: int - round number.
    :return: bool - was the round played?
    """
    for round in rounds:
        if round == number:
            return True
    return False

def card_average(hand):
    """Calculate and returns the average card value from the list.

    :param hand: list - cards in hand.
    :return: float - average value of the cards in the hand.
    """
    return sum(hand)/len(hand)

def approx_average_is_average(hand):
    """Return if an average is using (first + last index values ) OR ('middle' card) == calculated average.

    :param hand: list - cards in hand.
    :return: bool - does one of the approximate averages equal the `true average`?
    """
    way1 = (hand[0] + hand[-1]) / 2
    middleCard = len(hand) // 2
    average = sum(hand) / len(hand)

    if(way1 == average or hand[middleCard] == average):
        return True
    return False

def average_even_is_average_odd(hand):
    """Return if the (average of even indexed card values) == (average of odd indexed card values).

    :param hand: list - cards in hand.
    :return: bool - are even and odd averages equal?
    """
    sum_even = 0
    count_even = 0
    sum_odd = 0
    count_odd = 0

    for i, card in enumerate(hand):
        if i % 2 == 0:  # Even index
            sum_even += card
            count_even += 1
        else:  # Odd index
            sum_odd += card
            count_odd += 1

    # Calculate the averages
    average_even = sum_even / count_even if count_even > 0 else 0
    average_odd = sum_odd / count_odd if count_odd > 0 else 0

    # Check if the averages are the same and return the result
    return average_even == average_odd

def maybe_double_last(hand):
    """Multiply a Jack card value in the last index position by 2.

    :param hand: list - cards in hand.
    :return: list - hand with Jacks (if present) value doubled.
    """
    if(hand[-1] == 11):
        hand[-1] = hand[-1] * 2
        return hand
    return hand