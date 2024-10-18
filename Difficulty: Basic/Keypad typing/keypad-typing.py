#User function Template for python3


#Function to find matching decimal representation of a string as on the keypad.
def printNumber(s,n):
   
    d={"abc":2,"def":3,"ghi":4,"jkl":5,"mno":6,"pqrs":7,"tuv":8,"wxyz":9}
    ans=0
    for ch in s:
        for k in d.keys():
            if ch in k:
                ans=10*ans+d[k]
    return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3

#contributed by RavinderSinghPB
if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        
        
        s=input()
        n=len(s)
        print(printNumber(s,n))
# } Driver Code Ends