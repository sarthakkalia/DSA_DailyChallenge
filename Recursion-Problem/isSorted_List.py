# List is sorted or not 
# Method 1

def isSorted(arr):
    l=len(arr)
    if(l==0 or l==1):
        return True
    if(arr[0]>arr[1]):
        return False
    isSmallerSorted=isSorted(arr[1:])
    if isSmallerSorted:
        return True
    else:
        return False
print(isSorted([1,2,3,4]))
print(isSorted([3,2,1,4]))