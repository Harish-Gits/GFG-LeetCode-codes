//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.reverse(s));                        
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void swap(int l,int r,StringBuilder sb)
        {
            char c=sb.charAt(l);
            sb.setCharAt(l,sb.charAt(r));
            sb.setCharAt(r,c);
        }
    public String reverse(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        int l=0;
        int r=sb.length()-1;
        while(l<r)
        {
            if(!Character.isLetter(sb.charAt(l)))
                l++;
            else if(!Character.isLetter(sb.charAt(r)))
                r--;
            else
            {
                swap(l,r,sb);
                l++;
                r--;
            }
        }
        return sb.toString();
        
    }
}