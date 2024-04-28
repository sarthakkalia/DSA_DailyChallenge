# Remove a character from a string with Recursion

def remove_char(s):
    if(len(s)==0):
        return s
    smallerOutput=remove_char(s[1:])
    if(s[0]=='x'):
        return smallerOutput
    else:
        return s[0]+smallerOutput
    
print(remove_char("xaxbx"))