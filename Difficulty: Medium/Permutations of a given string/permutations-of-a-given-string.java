//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution
{
    Set<String> ans=new HashSet<>();
    
    public String swap(String s,int l,int h)
    {
        char ca[]=s.toCharArray();
        char ch=ca[l];
        ca[l]=ca[h];
        ca[h]=ch;
        return String.valueOf(ca);
    }
    
    public void permute(String s,int l,int h)
    {
        if(l==h)
            ans.add(s);
        else
        {
            for(int i=l;i<=h;i++)
            {
                s=swap(s,l,i);
                permute(s,l+1,h);
            }
        }
    }
    
    public List<String> find_permutation(String S)
    {
        int n=S.length()-1;
        permute(S,0,n);
        List<String> result=new ArrayList<>(ans);
        Collections.sort(result);
        return result;
    }
}