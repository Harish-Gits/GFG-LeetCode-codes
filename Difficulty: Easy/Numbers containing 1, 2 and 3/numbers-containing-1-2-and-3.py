#User function Template for python3

class Solution:
    def filterByDigits(self, arr):
        ans=[]
        flag=0
        for i in arr:
            temp=i
            while temp>0:
                r=temp%10
                if (r==1 or r==2 or r==3):
                    flag=1
                    pass
                else:
                    flag=0
                    break
                temp//=10
            if(flag):
                ans.append(i)
        #print(ans)
        return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        result = ob.filterByDigits(arr)
        print(" ".join(map(str, result)))
        tc -= 1

# } Driver Code Ends