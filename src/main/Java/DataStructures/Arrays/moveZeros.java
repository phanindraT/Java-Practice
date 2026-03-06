package DataStructures.Arrays;

import java.util.Arrays;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
*/

// TC -> O(n).  SC -> O(1)
class  moveZeros {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,8,5,1,4,2,0};
        moveZeros(arr);
    }
    public  static  void moveZeros(int[] arr){
        int j=0;
        for(int i=0; i< arr.length ; i++){
            if(arr[i] != 0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    j++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}