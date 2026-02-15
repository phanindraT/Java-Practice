package DataStructures.Arrays;

public class SecondlargestAndSecondsmallest {

    public static void main(String[] args) {
        // https://takeuforward.org/plus/dsa/problems/second-largest-element
        int a[] = new int[6];
        a = new int[]{1, 89, 29, 129,146, 16};
        // find the largest element in array.
        int temp=a[0];
        for (int i=1;i<a.length;i++)
        {
            if(temp < a[i])
                temp=a[i];

        }
        System.out.println("larget number in array :"+temp); // o(n)

        // find the second largest element in array.
        int slargest=-1;
                for (int i=0;i<a.length;i++){
                    if(slargest <a[i])
                    {
                        if(a[i]==temp)
                            continue;
                        slargest=a[i];
                    }
                }
        System.out.println("Second larget number in array :"+slargest); //o(n+n)=o(2n). o(n) for first largest and o(n) for second largest)


        // optimal solutions here for second largest or second smallest number in an array. O(n).
        a = new int[]{10,10,8};
        Secondlargest(a);

        a = new int[]{10,16,10,8,29,2};
        Secondsmallest(a);

    }

    public static void Secondlargest(int a[]){
        int max_value=Integer.MIN_VALUE ;
       int  slargest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max_value < a[i] )
            {
                slargest=max_value;
                max_value=a[i];

            }
            if(a[i]>slargest && a[i]<max_value){
                slargest=a[i];

            }

        }
        System.out.println("first largest: "+max_value);
        System.out.println("Second largest: "+slargest);
    }
    public static void Secondsmallest(int a[]){
        int min_value= Integer.MAX_VALUE;
        int ssmallest =Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(min_value > a[i]){
                ssmallest=min_value;
                min_value=a[i];
            }
            if(a[i] > ssmallest && a[i]<min_value ){
                ssmallest=a[i];
            }


        }
        System.out.println("first smallest: "+min_value);
        System.out.println("Second largest: "+ssmallest);
    }

}
