package easy;

import java.util.HashMap;
import java.util.Map;

public class CalculationSolution {

	/*
	 * 1. Two Sum
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * You may assume that each input would have exactly one solution.
	 * https://leetcode.com/problems/two-sum/
	 * Solution 1
	 */
	public Integer[] twoSumSolution1(int[] nums, int target) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			hashMap.put(nums[i], i);
		}
		for(int i=0; i<nums.length; i++) {
			int complement = target - nums[i];
			if(hashMap.containsKey(complement)) {
				return new Integer[] {i, hashMap.get(complement)};
			}
		}
        return new Integer[0];
    }
	
	/*
	 * 1. Two Sum
	 * Solution 2
	 */
	public Integer[] twoSumSolution2(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-1; j++){
				if(nums[i] + nums[j] == target) {
					return new Integer[]{i,j};
				}
			}
		}
		return new Integer[0];
	}
	
	/*
	 * 292. Nim Game
	 * https://leetcode.com/problems/nim-game/
	 */
	public boolean canWinNim(int n) {
        
    	return false;
    }

}
