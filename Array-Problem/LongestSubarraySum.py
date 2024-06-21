class LongestSubarraySum:
    def longestSubarray(self,arr):
        longest=0
        for i in range(len(arr)):
            sum=0
            for j in range(i,len(arr)):
                sum+=arr[j]
                if(sum==0):
                    longest= max(longest,j-i+1)
        return longest
    
obj=LongestSubarraySum()
x=obj.longestSubarray([9, -3, 3, -1, 6, -5])
print(x)