package Notes;

public class mergeSort {


    // https://www.youtube.com/watch?v=ogjf7ORKfd8&t=2441s

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 4, 50, 29};
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting : " );
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] );


        // TC -> O(n * log n)
        // SC -> O(n)

    }


    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // legnth of two arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, q = left;

     // merging both arrays back into array by sorting.
        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                arr[q] = L[i];
                i++;
            } else {
                arr[q] = R[j];
                j++;
            }
            q++;

        }

        while (i < n1) {
            arr[q] = L[i];
            q++;
            i++;
        }
        while (j < n2) {
            arr[q] = R[j];
            q++;
            j++;
        }

    }

}
