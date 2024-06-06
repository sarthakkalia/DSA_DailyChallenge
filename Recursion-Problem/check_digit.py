# Count digits in a number
# Problem Statement: Given an integer N, write a program to count the number of digits in N.

def check_digit(arr,l):
    if(l==len(arr)):
        return l
    return check_digit(arr, l+1)

num=1233
print(check_digit(str(num),0))