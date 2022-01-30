class Solution:
  def romanToInt(self, s: str) -> int:
    roman_int_conversion = {
      "I": 1,
      "V": 5,
      "X": 10,
      "L": 50,
      "C": 100,
      "D": 500,
      "M": 1000
    }

    previous = 0
    number = 0
    for character in s:
      current = roman_int_conversion[character]

      # Number has already been added, but should've been subtracted
      # Therefore, need to subtract it twice
      if previous < current:
        number -= 2 * previous

      number += current
      previous = current

    return number
