//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // testcases
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            // size of array
            int N = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            // adding elements to the array
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int P = Integer.parseInt(br.readLine().trim());
            // calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P);

            // printing array elements
            for (int i = 0; i < N; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // Create an array to store frequency of elements in the range 1 to P
        int freq[] = new int[P + 1];
        
        // Count the frequency of elements within the range 1 to P
        for (int i = 0; i < N; i++) {
            if (arr[i] <= P && arr[i] >= 1) {
                freq[arr[i]]++;
            }
        }
        
        // Modify the original array to store the frequency counts
        for (int i = 1; i <= N; i++) {
            if (i <= P) {
                arr[i - 1] = freq[i];
            } else {
                arr[i - 1] = 0;
            }
        }
    }
}

