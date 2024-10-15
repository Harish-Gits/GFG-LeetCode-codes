#User function Template for python3
import sys
class Solution:
    def maxProduct(self, arr):
        fm=-(sys.maxsize)
        sm=-(sys.maxsize)
        tm=-(sys.maxsize)
        fmi=smi=sys.maxsize
        for i in arr:
            if i>fm:
                tm=sm
                sm=fm
                fm=i
            elif i>sm:
                tm=sm
                sm=i
            elif i>tm:
                tm=i
        
            if i<fmi:
                smi=fmi
                fmi=i
            elif i<smi:
                smi=i
                
        
        return max(fm*sm*tm,fmi*smi*fm)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        arr = list(map(int, input().split()))
        ob = Solution()
        ans = ob.maxProduct(arr)
        print(ans)
        tc -= 1
# } Driver Code Ends