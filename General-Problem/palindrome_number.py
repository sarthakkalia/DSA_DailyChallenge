# Problem Statement:  Given a number check if it is a palindrome.

def pallindrome(num):
    l=str(num)
    return l==l[::-1]

print(pallindrome(121))