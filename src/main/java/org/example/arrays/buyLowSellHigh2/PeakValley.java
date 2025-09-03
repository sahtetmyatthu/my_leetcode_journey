package org.example.arrays.buyLowSellHigh2;

import java.util.Arrays;

public class PeakValley {

    public static int maxProfit(int[] prices) {

       int i = 0;
       int maxProfit = 0;
       int valley = prices[0];
       int peak = prices[0];


       while (i< prices.length - 1){
           while (i < prices.length - 1 && prices[i] >= prices[i+1]){
               i++;
           }

           valley = prices[i];

           while (i < prices.length - 1 && prices[i] <= prices[i+1]){
               i++;
           }

           peak = prices[i];

           maxProfit += peak - valley;
       }

       return maxProfit;

    }

    public static void main(String[] args) {


        // 2. Define a sample array of stock prices
        int[] stockPrices = {7, 1, 5, 3, 6, 4};

        // 3. Call the maxProfit method with the sample data
        int result = maxProfit(stockPrices);

        // 4. Print the input and the result to the console
        System.out.println("Trading with prices: " + Arrays.toString(stockPrices));
        System.out.println("Calculated maximum profit: " + result); // Expected output: 7

        System.out.println("---");

        // Another test case where no profit is possible
        int[] losingPrices = {7, 6, 5, 4, 3, 1};
        int noProfitResult = maxProfit(losingPrices);

        System.out.println("Trading with prices: " + Arrays.toString(losingPrices));
        System.out.println("Calculated maximum profit: " + noProfitResult); // Expected output: 0
    }
}
