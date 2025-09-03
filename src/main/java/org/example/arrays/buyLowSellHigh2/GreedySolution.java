package org.example.arrays.buyLowSellHigh2;

import java.util.Arrays;

public class GreedySolution {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
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

