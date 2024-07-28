//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        char[] s=S.toCharArray();
        Stack<StringBuilder> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s)
        {
            if(c!='.')
                sb.append(c);
            else
            {
                st.push(sb);
                sb=new StringBuilder(".");
                st.push(sb);
                sb=new StringBuilder();
            }
        }
        st.push(sb);
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty())
        {
            ans.append(st.pop());
            //ans.append(".");
        }
        return ans.toString();
    }
}