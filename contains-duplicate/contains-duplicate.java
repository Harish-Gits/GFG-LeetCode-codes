class Solution {
    public boolean containsDuplicate(int[] nums)
    {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        for(int e:m.values())
            if(e>1)
                return true;
        return false;
    }
    
}