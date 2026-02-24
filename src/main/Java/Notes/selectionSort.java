package Notes;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {

        // TC  --> O(n^2)
        //SC -->O(1)
        int[] arr = new int[]{5, 3, 4, 50, 29};
        int n= arr.length;

        for(int i=0; i<n-1; i++){
            int minIndex=i;

            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex =j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
