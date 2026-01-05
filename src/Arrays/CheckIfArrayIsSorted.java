package Arrays;
public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 4, 5};
        System.out.println(isSorted(nums));
    }

    private static boolean isSorted(int[] nums){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i+1] < nums[i]){
                return false;
            }
        }
        return true;
    }
}
