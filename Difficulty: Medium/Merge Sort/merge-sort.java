//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution {
    void merge(int arr[], int l, int m, int r) {
        // Use ArrayLists to hold the elements during merge
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        
        // Fill leftList with the left part of the array
        for (int i = l; i <= m; i++) {
            leftList.add(arr[i]);
        }
        
        // Fill rightList with the right part of the array
        for (int i = m + 1; i <= r; i++) {
            rightList.add(arr[i]);
        }

        // Merge the two lists back into the array
        int i = 0, j = 0;
        int k = l;
        while (i < leftList.size() && j < rightList.size()) {
            if (leftList.get(i) <= rightList.get(j)) {
                arr[k++] = leftList.get(i++);
            } else {
                arr[k++] = rightList.get(j++);
            }
        }

        // Copy remaining elements of leftList, if any
        while (i < leftList.size()) {
            arr[k++] = leftList.get(i++);
        }

        // Copy remaining elements of rightList, if any
        while (j < rightList.size()) {
            arr[k++] = rightList.get(j++);
        }
    }

    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
