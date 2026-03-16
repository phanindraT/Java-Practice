package DataStructures.Arrays;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        String s1 ="turvo";
        String s2 ="utrvo";


        // optimal solution
        boolean isAnagram = isAnagram(s1,s2);
        if(isAnagram)
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are not Anagrams");

       // by in-built Arrays sort method.
        arraysSort(s1,s2);

    }
    public static boolean isAnagram(String s1, String s2)
    {
        // TC -->O(n)+O(n)+O(26)=O(n). SC --> O(1)

        if(s1.length() != s2.length())
            return false;
        int[] count = new int[26];

     /*   for(char c : s1.toCharArray()) {
            count[c-'a']++; // --> count[c-'a'] = count[c-'a'] + 1;
        }
        for(char c : s2.toCharArray()){
            count[c-'a']--; // --> count[c-'a'] = count[c-'a'] - 1;
        }
        */

        for(int i =0; i < s1.length(); i++){
            count[s1.charAt(i)- 'a']++;
            count[s2.charAt(i)- 'a']--;
        }
        for(int n : count)
        {
            if(n != 0)
                return  false;
        }
        return true;
    }

    public  static  void arraysSort(String s1, String s2){
        //  TC --> O(n log n). SC --> O(n)+O(n) = O(n).

      char[] s1Array= s1.toCharArray();
      char[] s2Array= s2.toCharArray();
      Arrays.sort(s1Array);
      Arrays.sort(s2Array);
      boolean isAnagram = Arrays.equals(s1Array,s2Array);
        if(isAnagram)
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are not Anagrams");

      }

}
