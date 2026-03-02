package DataStructures.Arrays;

import java.util.Arrays;
import java.util.HashMap;

/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
// TC --> O(n)
// SC --> O(n)
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int j=0,q=0;
        for(int i=0; i < arr.length; i++){
            int diff = target - arr[i];
            if(hashmap.containsKey(diff)){
                j=hashmap.get(diff);
                q=i;
            }
            hashmap.put(arr[i],i);
        }
        System.out.println("j :"+j);
        System.out.println("q :"+q);
        return new int[]{j,q};
    }
}
