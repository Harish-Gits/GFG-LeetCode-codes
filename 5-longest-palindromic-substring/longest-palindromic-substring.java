class Solution {
    public String longestPalindrome(String s)
    {
        int maxLen=Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            int l=i,r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                if(maxLen<r-l+1)
                {
                    maxLen=r-l+1;
                    ans=s.substring(l,r+1);
                }
                l--;
                r++;
            }
            l=r=i;
            r++;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                if(maxLen<r-l+1)
                {
                    maxLen=r-l+1;
                    ans=s.substring(l,r+1);
                }
                l--;
                r++;
            }
        }  
        return ans;
    }
}