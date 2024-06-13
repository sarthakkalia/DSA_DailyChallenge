class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs: # empty list
            return ""

        result=strs[0]
        for str in strs[1:]:
            i=0
            while i<len(str) and i<len(result):
                if(str[i]!=result[i]):
                    result=result[:i]
                    break
                i+=1
            else:
                result=result[:i]
        return result
