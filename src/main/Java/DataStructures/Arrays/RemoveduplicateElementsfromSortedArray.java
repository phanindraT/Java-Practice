package DataStructures.Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveduplicateElementsfromSortedArray {
    // https://takeuforward.org/plus/dsa/problems/remove-duplicates-from-sorted-array
    // Remove duplicate elements IN-PLACE from sorted array.

    public static void main(String[] args) {
        int a[] = new int[]{1,1,2,2,2,3,3};

       // brute force.
        Set<Integer> b = new HashSet<>();

        for(int i=0;i<a.length;i++){
            b.add(a[i]);
        }
        int j=0;
        for(int q: b){
            a[j]=q;
            j++;
        }
        for(int i=0;i<j;i++)
        System.out.println("Unique elements :"+a[i]);

        // time complexity for the above set 0(nlogn)+o(n)

        removeduplicateelementsfromarray(a);

    }

   public static void removeduplicateelementsfromarray(int a[]){
     //  {1,2,3,4,5,6,3}
       int j=0;
        for(int i=1;i<a.length ;i++){
            if(a[i]!=a[j]) {
                j++;
                a[j] = a[i];

            }
        }

        for(int i=0;i<j-1;i++)
        System.out.println("---"+a[i]);

        // O(N) --> time complexity.
       // O(1) -->Space complexity.
    }


    }


