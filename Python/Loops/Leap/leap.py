#This is a function that takes a year as a parameter and returns True if the year is a leap year, False otherwise.
#The function should return True if the year is evenly divisible by 4
#except every year that is evenly divisible by 100
#unless the year is also evenly divisible by 400
#For example, 1997 is not a leap year, but 1996 is.  1900 is not a leap year, but 2000 is.

def leap_year(year):
    if (year % 100 == 0 and year % 400 != 0) or (year % 4 != 0):
        return False
    return True

print(leap_year(2015))