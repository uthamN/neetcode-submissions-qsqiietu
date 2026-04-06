class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, current = 0;
        for(int i = 1; i< prices.length;i++) {
            int data = prices[i] - prices[current];
            if(data < 0) {
                current = i;
            } else {
                if (data > profit) {
                    profit = data;
                }
            }
        }
        return profit;
    }
}
