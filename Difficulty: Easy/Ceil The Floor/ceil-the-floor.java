//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution 
{
    public static int getFloor(int x, int[] arr) 
    {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) 
            {
                ans = mid; // Record the potential floor
                low = mid + 1; // Move to the right to find a larger possible floor
            } 
            else 
            {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int getCeil(int x, int[] arr) 
    {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) 
            {
                ans = mid; // Record the potential ceiling
                high = mid - 1; // Move to the left to find a smaller possible ceiling
            } 
            else 
            {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] getFloorAndCeil(int x, int[] arr) 
    {
        Arrays.sort(arr); // Sort the array first

        int floorIdx = getFloor(x, arr);
        int ceilIdx = getCeil(x, arr);

        // If floorIdx is -1, it means no valid floor found, similarly for ceilIdx
        int floor = (floorIdx == -1) ? -1 : arr[floorIdx];
        int ceil = (ceilIdx == -1) ? -1 : arr[ceilIdx];

        return new int[]{floor, ceil};
    }
}
