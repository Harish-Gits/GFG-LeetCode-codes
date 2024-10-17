class Solution:
    def ExtractNumber(self,sentence):
        strarr=sentence.split()
        maxnum=-1
        for s in strarr:
            if(s.isdigit()):
                if '9' not in s:
                    maxnum=max(maxnum,int(s))
        return maxnum
                    


#{ 
 # Driver Code Starts
t = int(input())
for _ in range(t):
    S = input()
    ob = Solution()
    ans = ob.ExtractNumber(S)
    print(ans)

# } Driver Code Ends