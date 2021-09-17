package br.com.leetcode;

import java.util.Arrays;

public class September01_TwoSum {
	
	public static void main(String[] args) {
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] result = new int[2]; 
		result = twoSum(nums, target);
		System.out.println(Arrays.toString(result));
		
	}

	private static int[] twoSum(int[] nums, int target) {
		int[] array = new int[2];
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(i != j && nums[i] + nums[j] == target) {
					array[0] = i;
					array[1] = j;
					return array;
				}
			}
		}
		return array;
	}
	

}
