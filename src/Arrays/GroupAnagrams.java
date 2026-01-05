package Arrays;
import java.util.*;
/*
* Given an array of strings strs, group the anagrams together. You can return the answer in any order.
* Input: strs = ["eat","tea","tan","ate","nat","bat"]
* Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
*/
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    private static List<List<String>> groupAnagrams(String[] strs){
        // For every word we will sort the word and put in the map
        // same characters tho vere string vaste then we will sort it and check it in the map and put the original string

        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] words = str.toCharArray();
            Arrays.sort(words);
            // prati word sort chestam so that anagrams annitini oka list ki map cheyocchu
            String sortedWord = new String(words);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            //
            map.get(sortedWord).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

