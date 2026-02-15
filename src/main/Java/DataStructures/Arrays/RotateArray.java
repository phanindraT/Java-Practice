package DataStructures.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        // https://takeuforward.org/plus/dsa/problems/left-rotate-array

        int a[] = new int[]{12, 2, 3, 89, 29};


        // brute force left rotate by 1.
        int q = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = q;
        for (int i = 0; i < a.length; i++)
            System.out.println("left rotate array by 1 :" + a[i]);

        // brute force left rotate by r digits.
        a = new int[]{3, 4, 1, 5, 6, -29};
        int n[] = a.clone(); // clone method is needed for array b(for RightRotateArray method ) since array a will be modified in the LeftRotateArray method.
        int r = 2;
        LeftRotateArray(a, r);
        RightRotateArray(n, r);
        /* for the above  approaches :
                TC -> O(r)+O(n-r)+O(r)= O(n+r)
                SC -> O(r).

                Now the better optimal solution is not that much. Only SC can be improved by different logic.
                revesre(0,r)
                reverse(r,n)
                revesse(0,n)

                now the SC is O(1) but TC would be r+n-r+n = O(2n). The TC is slightly increased.

        */


    }


    public static void LeftRotateArray(int a[], int r) {

        r = r % a.length;
        //  int b[] = a.clone(); // only then a duplicate array for b is created. Otherwise both a,b point to same reference.
        int b[] = new int[r];
        for (int j = 0; j < r; j++) {
            b[j] = a[j];
        }

        for (int i = r; i < a.length; i++) {
            a[i - r] = a[i];
        }
        int w = 0;
        for (int j = a.length - r; j < a.length; j++) {
            a[j] = b[w];
            w++;
        }
        for (int i = 0; i < a.length; i++)
            System.out.println("left rotate array by r :" + a[i]);

        // TC -> O(r)+O(n-r)+O(r)= O(n+r)
        // SC ->O(r)
    }

    public static void RightRotateArray(int a[], int r) {
        r = r % a.length;
        // int b[] = a.clone(); // only then a duplicate array for b is created. Otherwise both a,b point to same reference.
        int b[] = new int[r];
        int l = a.length - r;
        for (int j = 0; j < r; j++) {
            b[j] = a[l];
            l++;
        }

        for (int i = a.length - 1; i >= r; i--) {
            a[i] = a[i - r];
        }
        int q = a.length - 1;
        for (int i = 0; i < r; i++) {
            a[i] = b[i];
        }
        for (int i = 0; i < a.length; i++)
            System.out.println("Right rotate array by r :" + a[i]);

    // TC -> O(r)+O(n-r)+O(r)= O(n+r)
        // SC ->O(r)
    }



}
