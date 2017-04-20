if __name__ == '__main__':
    n = int(raw_input())
    is_odd = (n & 1) == 1
    if is_odd:
        print 'Weird'
    else:
        if 6 <= n <= 20:
            print 'Weird'
        else:
            print 'Not Weird'
