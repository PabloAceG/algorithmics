import unittest
from roman_to_integer import Solution

__author__ = "Pablo Acereda"
__copyright__ = "Copyright 2022"
__credits__ = [ "Pablo Acereda" ]

__version__ = "1.0"
__maintainer__ = "Pablo Acereda"
__email__ = "p.aceredag@gmail.com"

class RomanToIntegerTest(unittest.TestCase):
  def test_romant_to_integer_1(self):
    """ Test to transform a roman number. """
    roman_number = "III"
    int_number = 3
    check = Solution()
    self.assertEquals(check.romanToInt(roman_number), int_number)

  def test_romant_to_integer_2(self):
    """ Test to transform a roman number. """
    roman_number = "LVIII"
    int_number = 58
    check = Solution()
    self.assertEquals(check.romanToInt(roman_number), int_number)

  def test_romant_to_integer_3(self):
    """ Test to transform a roman number. """
    roman_number = "MCMXCIV"
    int_number = 1994
    check = Solution()
    self.assertEquals(check.romanToInt(roman_number), int_number)
