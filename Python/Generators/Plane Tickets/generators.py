"""Functions to automate Conda airlines ticketing system."""


def generate_seat_letters(number):
    """Generate a series of letters for airline seats.

    :param number: int - total number of seat letters to be generated.
    :return: generator - generator that yields seat letters.

    Seat letters are generated from A to D.
    After D it should start again with A.

    Example: A, B, C, D

    """
    seats = ["A", "B", "C", "D"]

    for i in range(number):
        yield seats[i % 4]

def generate_seats(number):
    """Generate a series of identifiers for airline seats.

    :param number: int - total number of seats to be generated.
    :return: generator - generator that yields seat numbers.

    A seat number consists of the row number and the seat letter.

    There is no row 13.
    Each row has 4 seats.

    Seats should be sorted from low to high.

    Example: 3C, 3D, 4A, 4B

    """
    seats = ["A", "B", "C", "D"]
    row_number = 1

    for i in range(number):
        if row_number == 13:
            row_number += 1
        yield str(row_number) + seats[i % 4]
        if i % 4 == 3:
            row_number += 1

def assign_seats(passengers):
    """Assign seats to passengers.

    :param passengers: list[str] - a list of strings containing names of passengers.
    :return: dict - with the names of the passengers as keys and seat numbers as values.

    Example output: {"Adele": "1A", "Björk": "1B"}

    """
    assigned_seats = {}
    seat_generator = generate_seats(len(passengers))

    for passenger in passengers:
        seat = next(seat_generator)
        assigned_seats[passenger] = seat

    return assigned_seats

passengers = ['Jerimiah', 'Eric', 'Bethany', 'Byte', 'SqueekyBoots', 'Bob']
print((assign_seats(passengers)))

def generate_codes(seat_numbers, flight_id):
    """Generate codes for a ticket.

    :param seat_numbers: list[str] - list of seat numbers.
    :param flight_id: str - string containing the flight identifier.
    :return: generator - generator that yields 12 character long ticket codes.

    """
    for seat_number in seat_numbers:
        yield seat_number + flight_id + "0" * (12 - len(flight_id + seat_number))
