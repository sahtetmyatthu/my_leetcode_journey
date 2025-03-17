package org.example.Day001;

import java.util.HashMap;

/***
 *Real-World Example: Buying Items in a Store 🛒

 * Imagine you’re at a store, and you have $50 to spend. You want to buy exactly two items that add up to $50.
 * The store has these items:
 * 	1.	Shoes - $20
 * 	2.	Bag - $30
 * 	3.	Watch - $40
 * 	4.	Sunglasses - $10
 * You need to find which two items you can buy so that the total is $50.
 * How do you solve it?
 * 	•	You check each item one by one and see if there’s another item that completes your budget.
 * 	•	Shoes ($20) + Bag ($30) = $50 ✅
 * 	•	So, you pick Shoes and Bag!
 *
 */

public class RealWorldScenario {

    public static int[] findItems(int[] prices, int budget){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < prices.length; i ++){
            int needed = budget - prices[i];// What price do we need?

            if (map.containsKey(needed)){
                return new int[]{map.get(needed), i}; // Found the pair
            }

            map.put(prices[i], i);
        }
        throw new IllegalArgumentException("No valid items found.");

    }

    public static void main(String[] args) {

        int[] prices = {20, 30, 40, 10};
        int budget = 50;

        int[] result = findItems(prices, budget);
        System.out.println("You can buy items at indices: [" + result[0] + ", " + result[1] + "]");


    }


}
