package Arrays;
/*
* Problem Link:- https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
*
* Approach:
* - Use two pointers
* - pointer j tracks the next unique element
* - traverse the array whenever a unique element is found place it at index j.
*/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums){
        int n = nums.length;
        int j = 1;
        for(int i=1;i<n;i++){
            if(nums[i] != nums[i-1]){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
