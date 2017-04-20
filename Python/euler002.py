#!/bin/python

import sys


def f(n):
    if n == 0: return 0
    if n == 1: return 0
    if n == 2: return 2

    sum = 2
    fib0 = 0
    fib1 = 1
    fib2 = 2
    iter = 0
    while (fib2 <= n):
        if (iter == 3):
            sum = sum + fib2
            iter = 0
        fib0 = fib1
        fib1 = fib2
        fib2 = fib0 + fib1
        iter = iter + 1

    return sum


t = int(raw_input().strip())
for a0 in xrange(t):
    n = long(raw_input().strip())
    print f(n)
