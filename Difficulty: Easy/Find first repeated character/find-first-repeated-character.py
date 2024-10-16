#User function Template for python3

class Solution:

    def firstRepChar(self, s):
        se=set()
        for ch in s:
            if ch not in se:
                se.add(ch)
            else:
                return ch
        return -1


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        s = input()

        solObj = Solution()

        print(solObj.firstRepChar(s))
# } Driver Code Ends