class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
    {
        Set<Integer> s=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for(int e:nums2)
            s.add(e);
        for(int e:nums1)
        {
            if(s.contains(e))
            {
                l.add(e);
                s.remove(e);
            }
        }
        int n=l.size();
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
            ans[i]=l.get(i);
        return ans;
        
    }
}