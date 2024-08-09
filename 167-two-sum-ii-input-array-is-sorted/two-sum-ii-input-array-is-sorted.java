class Solution
{
    public int[] twoSum(int[] numbers, int target)
    {
        int st=0,end=numbers.length-1;
        while(st<end)
        {
            if(numbers[st]+numbers[end]==target)
                return new int[]{st+1,end+1};
            else if(numbers[st]+numbers[end]<target)
                st++;
            else
                end--;
        }
        return null;
    }
}