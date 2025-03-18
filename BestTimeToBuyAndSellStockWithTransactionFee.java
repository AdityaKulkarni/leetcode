class Solution {
    // int getProfit(int index, int[] prices, int[][]dp, int n, int buy, int fee){
        
    //     if(index == n){
    //         return 0;
    //     }

    //     if(dp[index][buy] != -1){
    //         return dp[index][buy];
    //     }

    //     if(buy == 1){
    //         dp[index][buy] = Math.max(-prices[index] + getProfit(index + 1, prices, dp, n, 0, fee), 0 + getProfit(index + 1, prices, dp, n, 1, fee));
    //     }else{
    //         dp[index][buy] = Math.max(prices[index] - fee + getProfit(index + 1, prices, dp, n, 1, fee), 0 + getProfit(index + 1, prices, dp, n, 0, fee));
    //     }

    //     return dp[index][buy];
    // }
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int prevBuy = 0, prevSell = 0;
        // int[][] dp = new int[n][2];

        // for(int i = 0; i < n; i++){
        //     dp[i][0] = -1;
        //     dp[i][1] = -1;
        // }
        
        // return getProfit(0, prices, dp, prices.length, 1, fee);

        for(int i = n-1; i >= 0; i--){
            int currBuy = 0, currSell = 0;
            for(int buy = 0; buy <= 1; buy++){
                if(buy == 1){
                    currBuy = Math.max(-prices[i] + prevSell, 0 + prevBuy);
                }else{
                    currSell = Math.max(prices[i] - fee + prevBuy, 0 + prevSell);
                }
            }

            prevSell = currSell;
            prevBuy = currBuy;
        }

        return prevBuy;
    }
}