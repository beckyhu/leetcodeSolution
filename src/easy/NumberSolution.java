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
	/**
	 * 7. Reverse Integer
	 * @param x
	 * @return
	 */
	public int reverse(int x) {
		int rx = 0;
		while(x != 0) {
			if(Math.abs(rx) > Integer.MAX_VALUE / 10){
				return 0;
			}
			rx = rx * 10 + x % 10;
			x /= 10;
		}
		return rx;
    }
	/**
	 * 8. String to Integer (atoi)
	 * @param str
	 * @return
	 */
	public int myAtoi(String str){
		if(str == null || str.length() == 0){
            return 0;
        }
        str = str.trim();
        if(str.length() == 0){
            return 0;
        }
		int numStart = 0;        
		char start = str.charAt(0);
		int sign = 1;
		if(start == '+') {
			numStart++;
		}else if(start == '-'){
			numStart++;
			sign = -1;
		}
		long sum = 0;
		for(int i = numStart; i < str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))){
				break;
			}
			sum = sum * 10 + str.charAt(i) - '0';
			if(sign == 1 && sum >= Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if(sign == -1 && sum <= Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
		}
		if(sum * sign >= Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if(sum * sign <= Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return (int)sum * sign;
	}
	/**
	 * 38. Count and Say
	 * @param n
	 * @return
	 */
	public String countAndSay(int n) {
        if(n == 0){
            return "";
        }
        String oldString = "1";
        while(n > 1){
            n--;
            char[] cArr = oldString.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<cArr.length; i++){
                int count = 1;
                while((i+1) < cArr.length && cArr[i] == cArr[i+1]){
                    count++;
                    i++;
                }
                sb.append(count).append(cArr[i]);
            }
            oldString = sb.toString();
        }
        return oldString;
    }
}
