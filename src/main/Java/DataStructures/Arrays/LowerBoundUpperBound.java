package DataStructures.Arrays;
  /*
    Lower Bound : In a sorted array, the lower bound of a value x is the index of the first element that is greater than or equal to x.
If x exists in the array, it points to the first occurrence. If x doesn’t exist, it points to the position where it can be inserted to maintain sorted order.
    Upper Bound : In a sorted array, the upper bound of a value x is the index of the first element that is strictly greater than x.
If x exists, it points to just after the last occurrence of x. If x doesn’t exist, it points to the position where it can be inserted.
     */

public class LowerBoundUpperBound {
    public static void main(String[] args) {
        // sorted array
        int[] arr = {0,2,2,5,11,29,32};
        int lowerBound = lowerBound(arr,11);
        System.out.println(" lowerBound :"+lowerBound);

        int upperBound =upperBound(arr,17);
        System.out.println(" upperBound :"+upperBound);


    }

    public static int lowerBound(int[] arr,int key){
        int low=0; int high = arr.length-1;
        int result=arr.length; // if key is bigger than all elements

        while(low <= high){
            int mid = low +(high-low)/2;

            if(arr[mid] >= key){
                result = mid; // possible lower bound
                high =mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return  result;
    }
  public static int upperBound(int[] arr, int key){
        int low=0; int high = arr.length-1;
        int result = arr.length; // if key is bigger than all elements

        while(low <= high) {
            int mid = low+(high -low)/2;

             if (arr[mid] > key) {
                result = mid ; // possible upper bound
                high = mid-1;
            }
             else {
                 low = mid+1;
             }
        }
        return result;
  }
}
