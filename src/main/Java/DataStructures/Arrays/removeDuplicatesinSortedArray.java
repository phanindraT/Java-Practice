package DataStructures.Arrays;

import java.util.Arrays;

public class removeDuplicatesinSortedArray {
    public static void main(String[] args) {

        int[] arr = {1,2,2,2,4,5,5,5,8,9,9};
        removeDuplicatesinSortedArray(arr); // atmost 1 time.
        System.out.println();
        arr = new int[]{1,2,2,2,4,5,5,5,8,9,9};
        System.out.println("Atmost twice in the array :");
        removeDuplicatesinSortedArrayNew(arr); // atmost 2 times.
        // TC -> O(n).  SC -> O(1)

    }

    public static void removeDuplicatesinSortedArray(int[] arr) {
        int j=1;
        for(int i =1; i < arr.length; i++){
            if(arr[i] != arr[j-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i =0; i <=j; i++){
            System.out.print(arr[i] + ",");
        }
    }
  public static void  removeDuplicatesinSortedArrayNew(int[] arr){
        int j=2;
        for(int i=2; i < arr.length; i++ ){
           if(arr[i] != arr[j-2] ){
               arr[j]=arr[i];
               j++;
           }
        }
      for(int i =0; i < j; i++){
          System.out.print(arr[i] + ",");
      }
  }
}
/*
Interview Trick :  Whenever you hear:
Allow atmost x duplicates in a sorted array,
Think immediately:  compare with nums[j-x]  with i = x & and j = x initially.

 */