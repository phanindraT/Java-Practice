package DataStructures.Arrays;

import java.util.HashMap;

public class elementCountofArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,5};

        //using hashmap. Hashmap approach works for both sorted and unsorted order.
        // TC -> O(n). SC -> O(n).
        int count =usingHashmap(arr,2);
        System.out.println("no. of times(using Hashmap) :"+count);

        //Using Binary Search  TC - > 2 × O(log n) = O(log n)  SC -> O(1) + O(1) = O(1).
        //This binary search works for sorted order only.
        int firstOccurence =usingBinarySearchforFirstOccurence(arr,2);
        int LastOccurence = usingBinarySearchforLastOccurence(arr,2);
        System.out.println("---firstOccurence-------"+firstOccurence);
        System.out.println("---LastOccurence-------"+LastOccurence);
        System.out.println("no. of times(using binary search) :"+ (LastOccurence-firstOccurence+1));

    }


    // TC -> O(n). SC -> O(n).
    public static int usingHashmap(int[] arr, int key){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer i :arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map.get(key);
     }


     // TC -> O(log n) SC -> O(1)
     public static int usingBinarySearchforFirstOccurence(int[] arr, int key){
      int low=0; int high = arr.length-1;
      int result =-1;

      while (low <= high){
          int mid = low+(high -low)/2;

          if(arr[mid] == key){
              result = mid;
              high =mid-1;
          }
          else if(arr[mid] < key){
              low= mid+1;
          }
          else{
              high = mid-1;
          }
      }
      return  result;
     }

    // TC -> O(log n) SC -> O(1)
     public static int usingBinarySearchforLastOccurence(int[] arr,int key){
        int low=0; int high = arr.length-1;
        int result =-1;

        while(low <= high){
            int mid = low+(high -low)/2;

            if(arr[mid] == key){
                result =mid;
                low =mid+1;
            }
            else if (arr[mid] < key) {
                low = mid+1;
            }
            else{
                high =mid-1;
            }
        }
        return  result;
     }


}
