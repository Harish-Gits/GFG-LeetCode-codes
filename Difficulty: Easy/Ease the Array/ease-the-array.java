//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    int arr [] = new int[n];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<n;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    obj.modifyAndRearrangeArr(arr, n);
		    for(int i=0; i< n;i++){
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}
	}
}



// } Driver Code Ends


//User function Template for Java


class Solution{
    void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    void modifyAndRearrangeArr (int arr[], int n)
    {
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]==arr[i])
            {
                arr[i-1]=2*arr[i-1];
                arr[i]=0;
            }
        }
        int zp=0;
        int nz=0;
        for(int i=0;i<n;i++)
        {
            if(arr[nz]!=0)
            {
                swap(arr,nz,zp);
                nz++;
                zp++;
            }
            else
                nz++;
        }
    }
}


