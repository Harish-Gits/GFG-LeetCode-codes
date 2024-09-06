//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution
{
    void rearrange(ArrayList<Integer> arr)
    {
        List<Integer> pe = new ArrayList<>();
        List<Integer> ne = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        

        for(int d : arr) {
            if(d >= 0)
                pe.add(d);
            else
                ne.add(d);
        }
        
        int i = 0;
        while(i < pe.size() && i < ne.size()) {
            ans.add(pe.get(i)); 
            ans.add(ne.get(i)); 
            i++;
        }
        
        while(i < pe.size()) {
            ans.add(pe.get(i));
            i++;
        }
        
        while(i < ne.size()) {
            ans.add(ne.get(i));
            i++;
        }
        arr.clear();
        arr.addAll(ans);
    }
}
