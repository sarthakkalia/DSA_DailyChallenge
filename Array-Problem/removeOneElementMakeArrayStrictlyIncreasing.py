class Solution:
    def canBeIncreasing(self, nums):
        def isIncreasing(nums):
            for i in range(len(nums)-1):
                if(nums[i]>=nums[i+1]):
                    return False
            return True

        for i in range(len(nums)):
            if(isIncreasing(nums[:i]+nums[i+1:])):
                return True
        return False
    
obj=Solution()
print(obj.canBeIncreasing([1,2,10,5,7]))