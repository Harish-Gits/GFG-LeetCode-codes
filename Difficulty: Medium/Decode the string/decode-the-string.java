//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s)
    {
        Stack<Integer> ns=new Stack<>();
        Stack<StringBuilder> ss=new Stack<>();
        int num=0;
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                num=num*10+(c-'0');
            }
            else if(c=='[')
            {
                ss.push(str);
                str=new StringBuilder();
                
                ns.push(num);
                num=0;
            }
            else if(c==']')
            {
                StringBuilder temp=str;
                str=ss.pop();
                int count=ns.pop();
                while(count-->0)
                    str.append(temp);
            }
            else
            {
                str.append(c);
            }
        }
        return str.toString();
    }
}