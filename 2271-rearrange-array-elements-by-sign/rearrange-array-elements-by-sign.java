class Solution
{
    public int[] rearrangeArray(int[] nums) 
    {
        int n=nums.length;
        if(n==0)
            return null;
        List<Integer> ps=new ArrayList<>();
        List<Integer> ns=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=0)
                ps.add(nums[i]);
            else
                ns.add(nums[i]);
        }
        int num[]=new int[n];
        int pi=0,ni=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==1)
                num[i]=ns.get(ni++);
            else
                num[i]=ps.get(pi++);
        }
        return num;
    }
}