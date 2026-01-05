package Arrays;
import java.util.*;

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicateWithHashSet(nums));
    }

    private static boolean containsDuplicateWithHashSet(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

    private static boolean containsDuplicateUsingSorting(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length - 1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

}

