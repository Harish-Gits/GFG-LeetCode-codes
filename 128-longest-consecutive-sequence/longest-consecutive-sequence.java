class Solution
{
    public int longestConsecutive(int[] nums)
    {
        int max=0;
        Set<Integer> set=new HashSet<>();
        for(int e:nums)
            set.add(e);
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(set.contains(num-1))
                continue;
            int currLen=0;
            while(set.contains(num))
            {
                currLen+=1;
                num+=1;
            }
            max=Math.max(max,currLen);
        }
        return max;
    }
}