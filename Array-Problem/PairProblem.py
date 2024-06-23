import math
class PairProblem(object):
    def lcm(self,x,y):
        return abs(x * y) // math.gcd(x, y)
    def hcf(self,x,y):
        return math.gcd(x, y)
    def pair_problem(cls,arr,n):
        cnt=0
        for i in range(n):
            for j in range(n):
                prd=cls.lcm(arr[i],arr[j])*cls.hcf(arr[i],arr[j])
                if prd in arr:
                    cnt+=1
        return cnt

obj=PairProblem()
x=obj.pair_problem([1,2,3,4,5],5)
print(x)
