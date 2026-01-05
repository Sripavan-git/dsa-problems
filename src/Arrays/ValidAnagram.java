package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValidAnagram {

    /*
    * Given two strings s and t, return true if t is an anagram of s, and false otherwise.*/
    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));

    }

    private static boolean isAnagramUsingSorting(String s, String t){
        if(s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    private static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] res = new int[26];
        for(char ch : s.toCharArray()){
            res[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            res[ch - 'a']--;
        }
        for(int i: res){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
