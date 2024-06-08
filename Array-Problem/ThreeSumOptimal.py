class Solution:
    def threeSum(self,arr):
        n=len(arr)
        arr.sort()
        ans=[]
        for i in range(0,n):
            if i!=0 and arr[i]==arr[i-1]:  continue  ## remove duplicates:
            j=i+1
            k=n-1
            while(j<k):
                sum=arr[i]+arr[j]+arr[k]
                if(sum <0): j+=1
                elif (sum >0): k-=1
                else:
                    temp=[arr[i],arr[j],arr[k]]
                    ans.append(temp)
                    j+=1 
                    k-=1
                    while j<k and arr[j]==arr[j-1]: j+=1
                    while j<k and arr[k] == arr[k + 1]: k-=1
        return ans


obj=Solution()
ans=obj.threeSum([-1, 0, 1, 2, -1, -4])
print(ans)