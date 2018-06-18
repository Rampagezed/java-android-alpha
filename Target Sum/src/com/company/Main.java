package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(findTargetSumWays(new int[]{1,1,1,1,1}, 3));
    }

    public int findTargetSumWays(int[] nums, int S) {

        sum(nums, 0, S, true);
        return counter;
    }

    int counter = 0;
    public void sum (int[] nums, int positionToChange, int target, boolean shouldCheck){
        if (shouldCheck && sumArray(nums) == target){
            counter++;
        }
        if (positionToChange == nums.length){
            return;
        }
        sum(nums, positionToChange + 1, target, false);
        nums[positionToChange] = -nums[positionToChange];
        sum(nums, positionToChange + 1, target, true);
        nums[positionToChange] = -nums[positionToChange];
    }

    public int sumArray (int [] nums){
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }

}
