# Sum of first N Natural Numbers

def sum_natural_no(i,sum):
    if(i<1):
        return sum
    return sum_natural_no(i-1, sum+i)

    
print(sum_natural_no(5,0))