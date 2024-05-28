# Check if a number is Armstrong Number or not
def armstrong(num):
    original_num=num
    num_digit=len(str(num))
    new_no=0
    while(num>0):
        new_no+=pow(num%10,num_digit)
        num=num//10
    if (original_num==new_no):
        return True
    else:
        return False        
        
print(armstrong(153))