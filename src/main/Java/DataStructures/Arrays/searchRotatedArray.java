package DataStructures.Arrays;
/*
In a rotated sorted array, At least one half is always sorted.

In every step:
Find mid.
Check which half is sorted.
Check if target lies inside that sorted half.
If yes → go there.
If no → go to other half.

We keep reducing search space like binary search (modified binary search).
Time complexity is O(log n).
 */
public class searchRotatedArray {
    public static void main(String[] args) {
        int[] arr= {5,32,35,1,2};
        int index = searchRotatedArray(arr,2);
        System.out.println("index of key : "+index);
    }
    static int searchRotatedArray(int[] arr, int key){
        int low=0; int high = arr.length -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == key) return mid;

            if(arr[low] <= arr[mid]){
                if(key >= arr[low] && key < arr[mid])  // we already checked with arr[mid] above so ignoring here
                    high =mid-1;
                else
                    low =mid+1;
            }
            else {
                if(key> arr[mid] && key <= arr[high])  // we already checked with arr[mid] above so ignoring here
                    low =mid+1;
                else
                    high =mid-1;
            }

        }
        return  -1;
    }
}
