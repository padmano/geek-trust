import unittest
from golden_crown import format_input
from collections import Counter


class GoldenCrownTestCases(unittest.TestCase):

    def test_is_format_input(self):
        owl_counter = Counter("aowl")
        self.assertDictEqual(format_input('air, "owla"'), {'air':owl_counter})

if __name__ == '__main__':
    unittest.main()