package Notes;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 3, 4, 50, 29};

        boolean swapped =false;
        int temp=0;

        for(int i=0; i< arr.length-1;i++){
            swapped =false;
            for(int j=0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped =true;
                }
            }
            if(!swapped)
                break;
        }

        System.out.println(Arrays.toString(arr));

    }
}
