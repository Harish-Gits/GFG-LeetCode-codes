#User function Template for python3

class Solution:
    def findIndex (self,arr, key ):
        fi=-1
        si=-1
        for i in range(len(arr)):
            if arr[i]==key:
                if(fi!=-1):
                    si=i
                else:
                    fi=i
        if(si==-1):
            return [fi,fi]
        return [fi,si]
                


#{ 
 # Driver Code Starts
#Initial Template for Python 3

t = int(input())
for _ in range(0, t):
    # n=int(input())
    a = list(map(int, input().split()))
    key = int(input())
    ob = Solution()
    ans = ob.findIndex(a, key)
    print(*ans)

# } Driver Code Ends