package easy;

import java.util.HashSet;
import java.util.Set;

public class NumberSolution {
	/**
	 * 283. Move Zeroes
	 * https://leetcode.com/problems/move-zeroes/
	 */
	public void moveZeroes(int[] nums) {
		int unZero = 0;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] != 0) {
        		nums[unZero] = nums[i];
        		unZero++;
        	}
        }
        for(int i = unZero; i < nums.length; i++) {
        	nums[i] = 0;
        }
    }
	
	/**
	 * 349. Intersection of Two Arrays
	 * https://leetcode.com/problems/intersection-of-two-arrays/
	 */
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        for(int num : nums1) {
        	set1.add(num);
        }
        Set<Integer> set2 = new HashSet<Integer>();
        for(int num : nums2) {
        	if(set1.contains(num)) {
        		set2.add(num);
        	}
        }

        int[] result = new int[set2.size()];
        int i = 0;
        for(Integer num : set2) {
        	result[i] = num;
        	i++;
        }
		return result;
    }
}
