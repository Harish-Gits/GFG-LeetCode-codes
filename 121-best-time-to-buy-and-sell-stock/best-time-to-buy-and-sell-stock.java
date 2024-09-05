class Solution {
    public int maxProfit(int[] prices)
    {
        int n=prices.length;
        if(n==0 || prices==null)
            return 0;
        int mini=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            int cp=prices[i]-mini;
            profit=Math.max(profit,cp);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
    }   
}