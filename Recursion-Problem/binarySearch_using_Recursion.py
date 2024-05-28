# Binary Search using Recursion

def binaySearch(a,x,si,ei):
    if si > ei:
        return -1
    
    mid=(si+ei)//2
    if(a[mid]==x):
        return mid
    elif(a[mid]>x):
        return binaySearch(a, x, si, mid-1)
    else:
        return binaySearch(a, x, mid+1, ei)
    
l1=[2,4,6,7,13,15,25,28,30]
print(binaySearch(l1,30,0,len(l1)-1))