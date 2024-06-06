# Problem Statement: Find the gcd of two numbers.

def find_gcd(num1,num2):
    if num2==0:
        return num1
    return find_gcd(num2, num1%num2)
print(find_gcd(4, 8))