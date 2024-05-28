# Problem Statement: Given a number, check whether it is prime or not. A prime number is a natural number that is only divisible by 1 and by itself.

def prime_number(num):
    if(num==2 or num==3):
        return True
    for i in range(2,int(num**0.5)+1):
        if(num%i==0):
            return False
    return True
        
print(prime_number(9))
print(prime_number(3))