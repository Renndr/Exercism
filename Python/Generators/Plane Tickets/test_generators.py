import unittest
from generators import generate_seats

class TestGenerateSeats(unittest.TestCase):
    def test_generate_seats(self):
        # Test that the function generates the correct number of seats
        self.assertEqual(len(list(generate_seats(16))), 16)

        # Test that the function generates seats in the correct format
        seats = list(generate_seats(8))
        self.assertEqual(seats[0], "1A")
        self.assertEqual(seats[1], "1B")
        self.assertEqual(seats[2], "1C")
        self.assertEqual(seats[3], "1D")
        self.assertEqual(seats[4], "2A")
        self.assertEqual(seats[5], "2B")
        self.assertEqual(seats[6], "2C")
        self.assertEqual(seats[7], "2D")

        # Test that the function skips row 13
        seats = list(generate_seats(20))
        self.assertNotIn("13A", seats)
        self.assertNotIn("13B", seats)
        self.assertNotIn("13C", seats)
        self.assertNotIn("13D", seats)

        # Test that the function sorts seats correctly
        seats = list(generate_seats(12))
        self.assertEqual(seats[0], "1A")
        self.assertEqual(seats[1], "1B")
        self.assertEqual(seats[2], "1C")
        self.assertEqual(seats[3], "1D")
        self.assertEqual(seats[4], "2A")
        self.assertEqual(seats[5], "2B")
        self.assertEqual(seats[6], "2C")
        self.assertEqual(seats[7], "2D")
        self.assertEqual(seats[8], "3A")
        self.assertEqual(seats[9], "3B")
        self.assertEqual(seats[10], "3C")
        self.assertEqual(seats[11], "3D")

if __name__ == '__main__':
    unittest.main()