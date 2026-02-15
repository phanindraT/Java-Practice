
public class fibnocci {
    public static void main(String[] args) {

        // iterative approach
      //  fibnocci(5);

        // recursive approach
        for (int i =1;i<=5;i++)
            System.out.print( fibonacciqa(i)+" " );


    }
     // TC :O(n) , SC : O(1)
    static void fibnocci(int n){
        System.out.print("1 1");
        int temp=1;
        int a=0;
        for(int i =1;i<n;i++){
          a=temp+i;
          temp=i;
          System.out.print(" "+a);
        }

    }

    //TC: O(2^n) (exponential, due to repeated calls), SC : O(n)
    static  int fibonacciqa(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacciqa(num - 1) + fibonacciqa(num - 2);
    }
}
