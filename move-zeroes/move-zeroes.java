class Solution {
    public void moveZeroes(int[] nums) 
    {
        if(nums.length==1 || nums.length==0)
            return;
        int zp=0,nz=0;
        while(nz<nums.length)
        {
            if(nums[nz]!=0)
            {
                swap(nums,nz,zp);
                nz++;
                zp++;
            }
            else
                nz++;
        }
    }
        public void swap(int[] nums,int a,int b)
        {
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
        }
    
}