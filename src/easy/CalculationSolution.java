package easy;

import java.util.HashMap;
import java.util.Map;

public class CalculationSolution {

	/**
	 * 1. Two Sum Given an array of integers, return indices of the two numbers
	 * such that they add up to a specific target. You may assume that each
	 * input would have exactly one solution.
	 * https://leetcode.com/problems/two-sum/ Solution 1
	 */
	public Integer[] twoSumSolution1(int[] nums, int target) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			hashMap.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (hashMap.containsKey(complement)) {
				return new Integer[] { i, hashMap.get(complement) };
			}
		}
		return new Integer[0];
	}

	/**
	 * 1. Two Sum Solution 2
	 */
	public Integer[] twoSumSolution2(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[i] + nums[j] == target) {
					return new Integer[] { i, j };
				}
			}
		}
		return new Integer[0];
	}

	/**
	 * 292. Nim Game https://leetcode.com/problems/nim-game/ 
	 * TODO:
	 */
	public boolean canWinNim(int n) {
		if (n % 4 != 0) {
			return true;
		}
		return false;
	}

	/**
	 * 136. Single Number Given an array of integers, every element appears
	 * twice except for one. Find that single one.
	 * https://leetcode.com/problems/single-number/ shint: XOR
	 */
	public int singleNumber(int[] nums) {
		int result = 0;
		for (int i : nums) {
			result ^= i;
		}
		return result;
	}

	/**
	 * 371. Sum of Two Integers Calculate the sum of two integers a and b, but
	 * you are not allowed to use the operator + and -.
	 * https://leetcode.com/problems/sum-of-two-integers/
	 */
	public int getSum(int a, int b) {
		// if(b == 0) return a;
		// int sum = a ^ b;
		// int carray = (a & b) << 1;
		// return getSum(sum, carray);
		return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
	}
	
	/**
	 * 258. Add Digits
	 * https://leetcode.com/problems/add-digits/
	 */
	public int addDigits1(int num) {
        while( num / 10 > 0) {
        	int sum = 0;
        	while(num > 0) {
        		sum += num % 10;
        		num /= 10;
        	}
        	num = sum;
        }
		return num;
    }
	public int addDigits2(int num) {
		int result = num % 9;
		if(num == 0) {
			return 0;
		}else if(result == 0) {
			return 9;
		}else {
			return result;
		}
	}
}
