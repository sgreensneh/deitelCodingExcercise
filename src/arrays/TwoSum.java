package arrays;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {11, 7, 2, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));


    }

    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }

//    public static int[] twoSum(int[] nums, int target){
//        Map<Integer, Integer> com = new HashMap<>();
//        for (int i = 0; i <nums.length ; i++) {
//            Integer comIndex = com.get(nums[i]);
//            if(comIndex != null){
//                return  new int[]{comIndex, i};
//            }
//            com.put(target - nums[i], i);
//        }
//        return nums;
//    }
}
