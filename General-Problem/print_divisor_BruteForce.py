# Print all Divisors of a given Number

def print_divisor(num):
    l=[]
    for i in range(1,num+1):
        if(num%i==0):
            l.append(i)
    return l

print(print_divisor(97))