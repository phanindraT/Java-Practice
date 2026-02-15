package DataStructures.Arrays;

public class ArraySortedorNotSorted
{
    // Check if the array is sorted
    public static void main(String args[]){
        int a[] = new int[]{12,29,32,48, 53};
        boolean sorted=false;
        // O(n)

        for(int i=0;i<a.length-1;i++){
            if(a[i]<= a[i+1])
                sorted=true;
            else{
                sorted= false;
                break;
            }
        }
     if(sorted)
         System.out.println("array is sorted in ascending order");
     else
         System.out.println("array is not sorted in ascending order");

    }

}
