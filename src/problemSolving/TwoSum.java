package problemSolving;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 18;
        System.out.println(Arrays.toString(twoSum(arr, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int s = 0;
            if (nums[i] < target) {
                s = nums[i];
            }
            index[i] = s;
        }
        return index;
    }
}
