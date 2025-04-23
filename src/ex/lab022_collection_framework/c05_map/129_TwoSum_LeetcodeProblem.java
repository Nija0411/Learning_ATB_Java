package ex.lab022_collection_framework.c05_map;

import java.util.HashMap;
import java.util.Map;

class TwoSumProblem {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 26;
        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }


    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);

        }

        return null;

    }
}
