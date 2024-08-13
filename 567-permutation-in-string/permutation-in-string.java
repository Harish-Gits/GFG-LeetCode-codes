class Solution
{
    public boolean checkInclusion(String s1, String s2)
    {
        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> have = new HashMap<>();

        int st=0,end=0;

        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            need.put(ch,need.getOrDefault(ch,0)+1);
        }
        while(end<s2.length())
        {
            char ch=s2.charAt(end);
            if(!need.containsKey(ch))
            {
                end++;
                st=end;
                have.clear();
                continue;
            }
            have.put(ch,have.getOrDefault(ch,0)+1);
            while(have.get(ch)>need.get(ch))
            {
                char sc=s2.charAt(st);
                have.put(sc,have.get(sc)-1);
                st++;
            }
            int ws=end-st+1;
            if(ws==s1.length())
                return true;
            end++;
        }
        return false;
    }
}