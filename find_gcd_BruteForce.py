# Problem Statement: Find the gcd of two numbers.

def find_gcd(num1,num2):
    l=[]
    for i in range(2,min(num1,num2)+1):
        if(num1%i==0 and num2%i==0):
            l.append(i)
    if len(l) == 0:
        return 1
    else:
        return max(l)
print(find_gcd(40,85))