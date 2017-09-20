package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MCalculationSolution {

	/**
	 * 11	Container With Most Water   
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
        	int newArea = 0;
        	if(height[left] <= height[right]){
        		newArea = height[left] * (right - left);
                left++;
        	}else {
        		newArea = height[right] * (right - left);
                right--;
        	}
        	if(newArea >= maxArea) {
        		maxArea = newArea;
        	}
        }
        return maxArea;
    }
	/**
	 * 15. 3Sum   
	 * @param nums
	 * @return
	 */
	
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> results = new LinkedList<>();
		if(nums == null || nums.length <3){
			return results;
		}
		Arrays.sort(nums);
		for(int i=0; i<nums.length - 2; i++) {
			if(i>0 && nums[i] == nums[i+1]){
				continue;
			}
			int target = -nums[i];
			int left = i + 1;
			int right = nums.length - 1;
			twoSum(nums, left, right, target, results);
		}
		return results;
	}
	public void twoSum(int[] nums, int left, int right, int target, List<List<Integer>> results){
		while(left < right) {
			if(nums[left] + nums[right] == target){
				List<Integer> triple = new ArrayList<Integer>();
				triple.add(-target);
				triple.add(nums[left]);
				triple.add(nums[right]);
				results.add(triple);
				left++;
				right--;
				while(left<right && nums[left]==nums[left-1]){
					left++;
				}
				while(left < right && nums[right] == nums[right + 1]) {
					right--;
				}
			}else if(nums[left] + nums[right] < target){
				left++;
			}else {
				right--;
			}
		}
	}
	
	class Triple {
		public int i1;
		public int i2;
		public int i3;
		public Triple(int i1, int i2, int i3) {
			this.i1 = i1;
			this.i2 = i2;
			this.i3 = i3;
		}
		public int hashCode(){
			return 0;
		}
		public boolean equals(Triple t2){
			if((i1+i2+i3) != (t2.i1+ t2.i2 + t2.i3)){
				return false;
			}
			if(i1==t2.i1){
				return i2!=t2.i2 || i2 !=t2.i3;
			}else if(i1==t2.i2){
				return i2!=t2.i1 || i2 !=t2.i3;
			}
			
			return false;
		}
	}
}
