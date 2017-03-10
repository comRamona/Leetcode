# https://leetcode.com/problems/word-break-ii/?tab=Description
from sets import Set
class Solution(object):
    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: List[str]
        """
    
        return self.split(s,Set(wordDict),{})
    
                
    def split(self,sen,dic,memo):
        res=[]
        if sen in dic:
            res.append(sen)
        if sen in memo:
            return memo[sen]
        for i in range(1,len(sen)):
            prefix=sen[:i]
            if prefix in dic:
                pos_sufixes=self.split(sen[i:],dic,memo)
                if len(pos_sufixes)>0:
                    for suf in pos_sufixes:
                        res.append(prefix+" "+suf)
               
        memo[sen]=res
        return res
                
