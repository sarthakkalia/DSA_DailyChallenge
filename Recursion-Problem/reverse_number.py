# Problem Statement: Given a number N reverse the number and print it.
def reverse_number(num):
    if(len(num)==0):
        return ''
    smallNum=reverse_number(num[1:])
    return smallNum+num[0]

num=123
print(reverse_number(str(num)))