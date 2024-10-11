#User function Template for python3
class Solution:
    # arr is the array
    def product(self, arr):
        ans=1
        for i in arr:
            ans*=i
        return ans%1000000007


#{ 
 # Driver Code Starts
#Initial Template for Python 3
import math


def main():
    T = int(input())
    while (T > 0):
        arr = [int(x) for x in input().strip().split()]
        obj = Solution()
        ans = obj.product(arr)
        print(ans)

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends