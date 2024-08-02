class Solution
{
    public int lengthOfLongestSubstring(String s)
    {
        int st=0,end=0;
        int maxLen=Math.min(s.length(),1);
        Set<Character> seen = new HashSet<>();
        while(end<s.length())
        {
            char c=s.charAt(end);
            while(seen.contains(c))
            {
                seen.remove(s.charAt(st));
                st++;
            }
            seen.add(c);
            maxLen=Math.max(maxLen,end-st+1);
            end++;
        }
        return maxLen;
    }
}