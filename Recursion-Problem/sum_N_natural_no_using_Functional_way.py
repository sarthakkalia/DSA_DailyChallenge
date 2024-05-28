# Sum of first N Natural Numbers

def sum_natural_no(n):
    if(n<1):
        return 0
    return n+sum_natural_no(n-1)
    
print(sum_natural_no(3))