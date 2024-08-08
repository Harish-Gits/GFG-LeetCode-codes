class Solution
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(nums==null  || nums.length==0)
            return result;
        Map<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        Set<String> used=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int cursum=nums[i]+nums[j];
                if(map.containsKey(-1*cursum))
                {
                    int k=map.get(-1*cursum);
                    if(!used.contains(nums[i]+":"+nums[j]+":"+nums[k]) && k>j)
                    {
                        used.add(nums[i]+":"+nums[j]+":"+nums[k]);
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return result;
    }
}