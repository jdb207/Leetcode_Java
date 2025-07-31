package Problems;

import java.util.Arrays;
import java.util.HashMap;

class ProblemOne {
    //Main Problem
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(numberMap.containsKey(target-nums[i])) {
                return new int[] {i, numberMap.get(target-nums[i])};
            }
            else{
                numberMap.put(nums[i],i);
            }
        }
        return new int[] {};
    }

    //Test Case
    public static void main(String[] args) {
        ProblemOne problemOne = new ProblemOne();
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(problemOne.twoSum(nums,9)));
    }
}