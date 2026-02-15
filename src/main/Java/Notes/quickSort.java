package Notes;

import java.util.Arrays;

public class quickSort {

    public static void main(String[] args) {

        int[] arr = new int[]{8, 2, 4, 9, 2, 5, 1, 5, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }
    public  static void quickSort(int[] arr, int low, int high){
         if(low < high){
             int pIndex = partition(arr, low, high);
             quickSort(arr,low,pIndex-1 );
             quickSort(arr,pIndex+1 ,high);
         }
    }
   public  static int partition(int[] arr, int low, int high){
           int pivot = arr[high];   // last element as pivot
           int i = low-1;   // index of smaller element. --> At the beginning, NO small elements are found to compare with pivot in the below code .

           for(int j = low; j < high; j++ ){

               if(arr[j] < pivot){
                   i++;
                   //swap arr[i] and arr[j]
                   int temp =arr[i];
                   arr[i]= arr[j];
                   arr[j] =temp;
               }
           }

           //placing the pivot element in the correct position
           int temp = arr[i+1];
           arr[i+1] =arr[high];
           arr[high]=temp;
            return i+1;
        }
   }

// TC --> O(nlog n)
// SC --> O(log n)
