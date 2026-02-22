package Notes;

import java.util.*;

public class QA {
    public static void main(String[] args) {

        int[] a = { 8,4, 4,4, 8, 9};
        String[] b = new String[]{};

        HashMap<String,String> hashmap = new HashMap<>();
        Set<String> set = new HashSet<>();
        ArrayList<String> list= new ArrayList<>();

        int z=0;
        int temp=0;
        for(int i=0;i<a.length;i++)
            for(int j=i+1; j<a.length;j++){
                if(a[i] > a[j]){
                    temp =a[i];
                    a[i] =a[j];
                    a[j]=temp;
                }

            }

        for(int i=0;i<a.length;i++)
            System.out.print(" "+a[i]);


        System.out.print(" var :"+a);


    }


}
