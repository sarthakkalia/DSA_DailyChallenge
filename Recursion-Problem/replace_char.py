# Recursion with string replace 'a' -> 'b'

def replace_char(s,a,b):
    if(len(s)==0):
        return s
    smallestOutput=replace_char(s[1:], a, b)
    if(s[0]==a):
        return b+smallestOutput
    else:
        return s[0]+smallestOutput
        
print(replace_char("abcabc", 'a', 'b'))