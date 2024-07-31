class Solution
{
    public int findKthLargest(int[] nums, int k)
    {
        PriorityQueue<Integer> mh=new PriorityQueue<>();
        for(int i=0;i<k;i++)
            mh.add(nums[i]);
        for(int i=k;i<nums.length;i++)
        {
            if(nums[i]>mh.peek())
            {
                mh.poll();
                mh.add(nums[i]);
            }
        }
        return mh.peek();
    }
}