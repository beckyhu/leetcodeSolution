package easy;

public class ArraySolution {
	/**
	 * 26. Remove Duplicates from Sorted Array
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int uniq = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != nums[uniq]){
                nums[++uniq] = nums[i];
            }
        }
        return uniq + 1;
    }
	/**
	 * 53. Maximum Subarray
	 * @param nums
	 * @return
	 */
	public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int sum = Integer.MIN_VALUE;
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(sum < 0){
                sum = nums[i];
            }else{
                sum += nums[i];
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
	/**
	 * 66. Plus One
	 * @param digits
	 * @return
	 */
	public int[] plusOne(int[] digits) {
        int add = 1;
        int length = digits.length;
        int sum = digits[length-1] + add;
        int carry = sum / 10;
        digits[length-1] = sum % 10;
        for(int i=digits.length-2; i>=0 && carry>0; i--){
            sum = digits[i] + carry;
            carry = sum / 10;
            digits[i] = sum % 10;
        }
        if(carry == 0){
            return digits;
        }
        int[] withCarry = new int[length + 1];
        withCarry[0] = carry;
        for(int i = 1; i < length+1; i++){
            withCarry[i] = digits[i-1];
        }
        return withCarry;
    }
}
