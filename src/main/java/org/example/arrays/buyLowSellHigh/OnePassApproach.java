package org.example.arrays.buyLowSellHigh;

public class OnePassApproach {
    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:prices){
            if(price<minPrice){
                minPrice = price;
            }

            int profit = price - minPrice;

            if(maxProfit < profit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example input
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}
