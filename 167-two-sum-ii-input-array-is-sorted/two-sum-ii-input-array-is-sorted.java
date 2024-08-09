class Solution
{
    public int[] twoSum(int[] numbers, int target)
    {
        int st=0,end=numbers.length-1;
        int ans[]=new int[2];
        while(st<end)
        {
            if(numbers[st]+numbers[end]==target)
            {
                ans[0]=st+1;
                ans[1]=end+1;
                return ans;
            }
            else if(numbers[st]+numbers[end]<target)
                st++;
            else
                end--;
        }
        return ans;
    }
}