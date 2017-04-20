#!/bin/python

import sys

def sum_of_n_multiples_less_than_x(x, n):
    p = x / n
    return (n * (p * (p + 1))) / 2


t = int(raw_input().strip())
sum = 0
for a0 in xrange(t):
    n = int(raw_input().strip())
    print (sum_of_n_multiples_less_than_x(n - 1, 3) + sum_of_n_multiples_less_than_x(n - 1,
                                                                                     5) - sum_of_n_multiples_less_than_x(
        n - 1, 15))
