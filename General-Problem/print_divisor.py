# Print all Divisors of a given Number

def print_divisor(num):
    l=[]
    for i in range(1,int(pow(num,0.5))+1):
        if(num%i==0):
            l.append(i)
            if(i!=num/i):
                l.append(int(num/i))
    l.sort(reverse=False)
    return l

print(print_divisor(36))