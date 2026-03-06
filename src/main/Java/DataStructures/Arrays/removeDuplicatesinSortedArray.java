package DataStructures.Arrays;

import java.util.Arrays;

public class removeDuplicatesinSortedArray {
    public static void main(String[] args) {

        int[] arr = {1,2,2,2,4,5,5,5,8,9,9};
        removeDuplicatesinSortedArray(arr); // atmost 1 time.
        removeDuplicatesinSortedArrayNew(arr); // atmost 2 times.
    }

    public static void removeDuplicatesinSortedArray(int[] arr) {
        int j =0;
        for(int i =1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                j++;
                arr[j] = arr[i];
            }
        }
        for(int i =0; i <=j; i++){
            System.out.print(arr[i] + ",");
        }

         //   System.out.println(Arrays.toString(arr));

    }
  public static void  removeDuplicatesinSortedArrayNew(int[] arr){
        int j=2;
        int[] arrQA = {1,2,2,2,4,5,5,5,8,9,9};
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
Think immediately:  compare with nums[j-x]  with i and j starting from x.

 */