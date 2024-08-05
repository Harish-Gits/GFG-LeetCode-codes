class Solution
{
    public int[] topKFrequent(int[] nums, int k)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int d:nums)
            map.put(d,map.getOrDefault(d,0)+1);
        Map<Integer,List<Integer>> rmap=new HashMap<>();
        for(int e:map.keySet())
        {
            int count=map.get(e);
            if(!rmap.containsKey(count))
                rmap.put(count,new ArrayList<Integer>());
            rmap.get(count).add(e);        }
        int ans[]=new int[k];
        int i=0;
        for(int j=nums.length;j>=1;j--)
        {
            if(rmap.containsKey(j))
            {
                for(int x:rmap.get(j))
                {
                    if(i<k)
                        ans[i++]=x;
                    else
                        break;
                }
            }
            if(i>=k)
                break;
        }
        return ans;
    }
}