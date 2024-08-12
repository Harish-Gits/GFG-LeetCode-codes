class Solution {
    public int maxProfit(int[] prices)
    {
        int n=prices.length;
        if(n==0 || prices==null)
            return 0;
        
        int profit=0;
        int buyPrice=prices[0];

        for(int i=1;i<n;i++)
        {
            if(prices[i]<=buyPrice)
            {
                buyPrice=prices[i];
                continue;
            }
            profit=Math.max(profit,prices[i]-buyPrice);
        }
        return profit;
    }
}