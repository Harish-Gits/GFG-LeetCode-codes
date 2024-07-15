class Solution {
    public int minimumMoves(String s)
    {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=sb.charAt(i);
            if(c=='X')
            {
                count++;
                sb.setCharAt(i,'0');
                if(i+1<n)
                    sb.setCharAt(i+1,'0');
                if(i+2<n)
                    sb.setCharAt(i+2,'0');
            }
        }
        return count;
    }
}