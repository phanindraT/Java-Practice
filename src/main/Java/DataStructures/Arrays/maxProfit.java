package DataStructures.Arrays;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class maxProfit {

    public static void main(String[] args) {
        int[] arr ={7,1,5,3,6,4};
        int profit = maxProfit(arr);
        System.out.println("-- maxProfit : "+profit);
        int profit_bruteForce = maxProfit_byBruteForce(arr);
        System.out.println("-- profit_bruteForce : "+profit_bruteForce);
    }

    public static int maxProfit(int[] arr){
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int p : arr){
            min = Math.min(min,p);
            profit = Math.max(profit,p-min);
        }
        return profit;
    }

    public  static int maxProfit_byBruteForce(int[] arr){
        int profit =0;
        int temp=0;
        for(int i=0; i < arr.length ;i++){
            for(int j =i+1; j < arr.length;  j++){
                temp =arr[j] - arr[i];
                if(temp > profit)
                    profit = temp;
            }
        }
        return  profit;
    }
}
