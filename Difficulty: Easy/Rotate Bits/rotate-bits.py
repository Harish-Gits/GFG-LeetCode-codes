#User function Template for python3

class Solution:
    def rotate(self, N, D):
        D=D%16
        mask=(1<<16)-1
        lr=((N<<D) | (N>>(16-D))) & mask
        rr=((N>>D) | (N<<(16-D))) & mask
        return [lr,rr]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, d = input().strip().split(" ")
        n, d = int(n), int(d)
        ob = Solution()
        ans = ob.rotate(n, d)
        print(ans[0])
        print(ans[1])
# } Driver Code Ends