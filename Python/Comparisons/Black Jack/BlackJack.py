"""Functions to help play and score a game of blackjack.

How to play blackjack:    https://bicyclecards.com/how-to-play/blackjack/
"Standard" playing cards: https://en.wikipedia.org/wiki/Standard_52-card_deck
"""
card_values = {
    'J': 10,
    'Q': 10,
    'K': 10,
    'A': 1,
    '2': 2,
    '3': 3,
    '4': 4,
    '5': 5,
    '6': 6,
    '7': 7,
    '8': 8,
    '9': 9,
    '10': 10,
}

def value_of_card(card):
    """Determine the scoring value of a card.

    :param card: str - given card.
    :return: int - value of a given card.  See below for values.

    1.  'J', 'Q', or 'K' (otherwise known as "face cards") = 10
    2.  'A' (ace card) = 1
    3.  '2' - '10' = numerical value.
    """
    if card in card_values:
        return card_values[card]
    else:
        try:
            return int(card)
        except ValueError:
            raise ValueError("Invalid card: '{}'".format(card))


def higher_card(card_one, card_two):
    """Determine which card has a higher value in the hand.

    :param card_one, card_two: str - cards dealt in hand.  See below for values.
    :return: str or tuple - resulting Tuple contains both cards if they are of equal value.

    1.  'J', 'Q', or 'K' (otherwise known as "face cards") = 10
    2.  'A' (ace card) = 1
    3.  '2' - '10' = numerical value.
    """
    value_one = card_values.get(card_one)
    value_two = card_values.get(card_two)

    if value_one > value_two:
        return card_one
    if value_two > value_one:
        return card_two
    if value_one == value_two:
        return (card_one,card_two)

def value_of_ace(card_one, card_two):
    """Calculate the most advantageous value for the ace card.

    :param card_one, card_two: str - card dealt. See below for values.
    :return: int - either 1 or 11 value of the upcoming ace card.

    1.  'J', 'Q', or 'K' (otherwise known as "face cards") = 10
    2.  'A' (ace card) = 11 (if already in hand)
    3.  '2' - '10' = numerical value.
    """
    value_one = card_values.get(card_one)
    value_two = card_values.get(card_two)
    
    if 'A' in (card_one, card_two):
        return 1
    if value_one + value_two > 10:
        return 1
    else:
        return 11

def is_blackjack(card_one, card_two):
    """Determine if the hand is a 'natural' or 'blackjack'.

    :param card_one, card_two: str - card dealt. See below for values.
    :return: bool - is the hand is a blackjack (two cards worth 21).

    1.  'J', 'Q', or 'K' (otherwise known as "face cards") = 10
    2.  'A' (ace card) = 11 (if already in hand)
    3.  '2' - '10' = numerical value.
    """
    value_one = card_values.get(card_one)
    value_two = card_values.get(card_two)

    if (value_one == 1 or value_two == 1) and (value_one == 10 or value_two == 10):
        return True
    else:
        return False
    
def can_split_pairs(card_one, card_two):
    """Determine if a player can split their hand into two hands.

    :param card_one, card_two: str - cards dealt.
    :return: bool - can the hand be split into two pairs? (i.e. cards are of the same value).
    """
    value_one = card_values.get(card_one)
    value_two = card_values.get(card_two)

    if value_one == value_two:
        return True
    else:
        return False

def can_double_down(card_one, card_two):
    """Determine if a blackjack player can place a double down bet.

    :param card_one, card_two: str - first and second cards in hand.
    :return: bool - can the hand can be doubled down? (i.e. totals 9, 10 or 11 points).
    """
    value_one = card_values.get(card_one)
    value_two = card_values.get(card_two)

    total_value = value_one + value_two

    if  9 <= total_value <= 11 and not (value_one == 10 and value_two == 1) and not (value_one == 1 and value_two == 10):
        return True
    else:
        return False