//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        Solution ob = new Solution(); // Instantiate the Solution object once

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length]; // Changed to int[]

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            System.out.println(ob.findMin(arr));
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution
{
    public int findMin(int[] arr)
    {
        int low=0,high=arr.length-1;
        int mini=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[low]<=arr[mid])
            {
                mini=Math.min(mini,arr[low]);
                low=mid+1;
            }
            else
            {
                mini=Math.min(mini,arr[mid]);
                high=mid-1;
            }
        }
        return mini;
    }
}
