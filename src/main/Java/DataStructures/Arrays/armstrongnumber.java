package DataStructures.Arrays;

public class armstrongnumber {

    public static void main(String[] args) {
        int n = 153;
        int givenNumber =n;
        int length = String.valueOf(n).length();
        System.out.println(length);
        int fullTotal =0;
        while(n > 0){
             int q = n % 10;
            int sum =powerCalculator(q,length);
            fullTotal = fullTotal+sum;
            n=n/10;
        }
        System.out.println(fullTotal);
        if(fullTotal == givenNumber)
            System.out.println("given number is armstrongnumber");
        else
            System.out.println("given number is not armstrongnumber");

    }

     public static int powerCalculator(int a, int b){
        int total=1;
        while(b >= 1 ){
            total = total *a;
            b--;
        }
        return  total;
     }

}
