package easy;

import java.util.HashMap;
import java.util.Map;

public class CalculationSolution {


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

}
