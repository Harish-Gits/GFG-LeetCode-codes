
class Solution:
    def oddEven(self, s : str) -> str:
        d={}
        oc=ec=0
        for ch in s:
            d[ch]=d.get(ch,0)+1
        for ch in d.keys():
            if ord(ch)%2!=0 and d[ch]%2!=0:
                oc+=1
            elif ord(ch)%2==0 and d[ch]%2==0:
                ec+=1
        return"EVEN" if(oc+ec)%2==0 else "ODD"
        



#{ 
 # Driver Code Starts
if __name__ == "__main__":
    t = int(input())
    for _ in range(t):

        s = (input())

        obj = Solution()
        res = obj.oddEven(s)

        print(res)

# } Driver Code Ends