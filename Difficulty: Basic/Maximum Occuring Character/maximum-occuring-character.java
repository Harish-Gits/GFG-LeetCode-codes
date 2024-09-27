//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        int count=0,max=0;
        char mc=' ';
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:line.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        for(char ch:map.keySet())
        {
            count=map.get(ch);
            if(count>max || count==max && ch<mc)
            {
                max=count;
                mc=ch;
            }
        }
        return mc;
    }

    
}