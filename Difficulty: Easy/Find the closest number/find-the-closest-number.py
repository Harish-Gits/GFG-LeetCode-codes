
from typing import List


class Solution:
    def findClosest(self, n : int, k : int, arr : List[int]) -> int:
        low=0
        high=n-1
        small=0
        large=n-1
        while(low<=high):
            mid=low+(high-low)//2
            if(arr[mid]==k):
                return k
            elif(arr[mid]<k):
                small=mid
                low=mid+1
            else:
                large=mid
                high=mid-1
        if(abs(arr[small]-k)<abs(arr[large]-k)):
            return arr[small]
        elif(abs(arr[small]-k)>abs(arr[large]-k)):
            return arr[large]
        else:
            return max(arr[small],arr[large])



#{ 
 # Driver Code Starts

class IntArray:
    def __init__(self) -> None:
        pass
    def Input(self,n):
        arr=[int(i) for i in input().strip().split()]#array input
        return arr
    def Print(self,arr):
        for i in arr:
            print(i,end=" ")
        print()


if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        n = int(input())
        
        
        k = int(input())
        
        
        arr=IntArray().Input(n)
        
        obj = Solution()
        res = obj.findClosest(n, k, arr)
        
        print(res)
        

# } Driver Code Ends