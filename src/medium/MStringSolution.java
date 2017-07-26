package medium;

import java.util.Arrays;

public class MStringSolution {

	/**
	 * 3. Longest Substring Without Repeating Characters
	 * https://leetcode.com/problems/longest-substring-without-repeating-characters/#/description
	 */
	public int lengthOfLongestSubstring(String s) {
		if(s == null){
			return 0;
		}
        int[] indexArr = new int[256];
        Arrays.fill(indexArr, -1);
        int result = 0;
        int left = -1;
		for(int i=0; i<s.length(); i++){
			left = Math.max(left, indexArr[s.charAt(i)]);
			indexArr[s.charAt(i)] = i;
			result = Math.max(result, i-left);
		}
		return result;
    }
}
