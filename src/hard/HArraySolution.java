package hard;

public class HArraySolution {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int total = nums1.length + nums2.length;
		if (total % 2 == 0) {
			return (findXth(total / 2, nums1, nums2, 0, 0) + findXth(total / 2 + 1, nums1, nums2, 0, 0)) / 2.0;
		} else {
			return findXth(total / 2 + 1, nums1, nums2, 0, 0);
		}
	}

	private int findXth(int x, int[] num1, int[] num2, int num1Start, int num2Start) {
		if (num1Start >= num1.length) {
			return num2[num2Start + x - 1];
		}
		if (num2Start >= num2.length) {
			return num1[num1Start + x - 1];
		}
		if (x == 1) {
			return Math.min(num1[num1Start], num2[num2Start]);
		}
		int m1 = num1Start + x / 2 - 1;
		int m2 = num2Start + x / 2 - 1;
		int mid1 = m1 < num1.length ? num1[m1] : Integer.MAX_VALUE;
		int mid2 = m2 < num2.length ? num2[m2] : Integer.MAX_VALUE;
		if (mid1 < mid2) {
			return findXth(x - x / 2, num1, num2, m1 + 1, num2Start);
		} else {
			return findXth(x - x / 2, num1, num2, num1Start, m2 + 1);
		}
	}
	/**
	 * 41. First Missing Positive
	 * @param nums
	 * @return
	 */
	public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 1;
        }
        for(int i=0; i<nums.length; i++){
            while(nums[i] < nums.length && nums[i] > 0 && nums[i] != i+1){
                int tmp = nums[nums[i]-1];
                if(tmp == nums[i]){
                    break;
                }
                nums[nums[i] -1] = nums[i];
                nums[i] = tmp;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length + 1;
    }
	/**
	 * 42. Trapping Rain Water
	 * @param height
	 * @return
	 */
	public int trap(int[] height) {
        if(height == null || height.length <= 1){
            return 0;
        }
        int left = 0; 
        int right = height.length - 1;
        int result = 0;
        int leftHeight = height[left];
        int rightHeight = height[right];
        while(left < right){
            if(leftHeight < rightHeight){
                left++;
                if(leftHeight > height[left]){
                    result += (leftHeight - height[left]);
                }else{
                    leftHeight = height[left];
                }
            }else{
                right--;
                if(rightHeight > height[right]){
                    result+= (rightHeight - height[right]);
                }else{
                    rightHeight = height[right];
                }
            }
        }
        return result;
    }
}
