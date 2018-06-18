package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] svet = {1,2};

    }

    public static int[] twoSum(int[] nums, int target) {
int[] result = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result = new int[]{i, j};
                }
            }
        }

        return result;
    }
}
