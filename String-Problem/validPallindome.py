class Solution:
    def isPalindrome(self, s: str) -> bool:
        temp=[]
        for c in s:
            if c.isalnum():
                temp.append(c.lower())
        if(temp==temp[::-1]):
            return True
        return False
