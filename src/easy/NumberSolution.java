package easy;

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
}
