package DataStructures.Arrays;
// Search in 2D Matrix (Row & Column Sorted)
public class searchInmatrix {
    public static void main(String[] args) {

        int[][] matrix ={
                {1,4,7},
                {2,5,8},
                {3,6,9}
        };
        boolean isPresent = searchInmatrix(matrix,9);
        System.out.println("key is found in matrix : "+isPresent);
    }
    public static boolean searchInmatrix(int[][] matrix, int key){
        int row=0; int col =matrix[0].length-1;
        while(row < matrix.length && col >=0){
            if(matrix[row][col] == key)
                return true;
                else if(key < matrix[row][col] )
                         col--;
                else row++;
        }
        return false;
    }
}
