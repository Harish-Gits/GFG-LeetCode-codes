class Solution {
    public void sortColors(int[] nums)
    {
        int n=nums.length;
        int zp=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                int temp=nums[zp];
                nums[zp]=nums[i];
                nums[i]=temp;
                zp++;
            }
            else
                continue;
        }
        int op=zp;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                int temp=nums[op];
                nums[op]=nums[i];
                nums[i]=temp;
                op++;
            }
            else
                continue;
        }       
    }
}