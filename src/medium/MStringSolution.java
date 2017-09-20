package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public String longestPalindrome(String s) {
		if(s == null) {
			return null;
		}
		int sLength = s.length();
		if(sLength == 0 || sLength == 1){
			return s;
		}
		boolean[][] dp = new boolean[sLength][sLength];
		int i,j;
		for(i = 0; i < sLength; i++) {
			for(j = 0; j < sLength; j++) {
				if(i >= j){
					dp[i][j] = true;
				}else {
					dp[i][j] = false;
				}
			}
		}
		int ph = 0;
		int pt = 0;
		int maxLength = 1;
		for(int k=1; k<sLength; k++) {
			for(i=0; i+k<sLength; i++) {
				j = i + k;
				if(s.charAt(i) != s.charAt(j)) {
					dp[i][j] = false;
				}else {
					dp[i][j] = dp[i+1][j-1];
					if(dp[i][j]) {
						if(k + 1 > maxLength){
							maxLength = k + 1;
							ph = i;
							pt = j;
						}
					}
				}
			}
		}
		
		return s.substring(ph, pt+1);
	}
	public String longestCommon(String s1, String s2) {
		if(s1 == null || s2 == null){
			return null;
		}
		if(s1 == "" || s2 == ""){
			return "";
		}
        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        int[][] common = new int[cs1.length][cs2.length];
        for(int j = 0; j < cs2.length; j++) {
        	common[0][j] = cs1[0] == cs2[j] ? 1: 0;
        }
        for(int i = 1; i < cs1.length; i++) {
        	common[i][0] = cs1[i] == cs2[0] ? 1: 0;
        	for(int j = 1; j < cs2.length; j++) {
        		if(cs1[i] == cs2[j]){
        			common[i][j] = common[i-1][j-1] + 1;
        		}else {
        			common[i][j] = 0;
        		}
        	}
        }
        int maxLength = 0;
        int start1 = 0;
        int start2 = 0;
        for(int i=0; i<cs1.length; i++) {
        	for(int j=0; j<cs2.length; j++) {
        		if(common[i][j] > maxLength) {
        			maxLength = common[i][j];
        			start1 = i - maxLength + 1;
        			start2 = j - maxLength + 1;
        		}
        	}
        }
        return s1.substring(start1, start1+maxLength);
    }
	/**
	 * 	17. Letter Combinations of a Phone Number   
	 * @param digits
	 * @return
	 */
	public ArrayList<String> letterCombinations(String digits){
		ArrayList<String> res = new ArrayList<>();
		if(digits == null || digits.length() == 0){
			return res;
		}
		Map<Character, String> map = new HashMap<>();
		map.put('2', "abc");
        map.put('3', "def");map.put('4', "ghi");map.put('5', "jkl");map.put('6', "mno");
        map.put('7', "pqrs"); map.put('8', "tuv");
        map.put('9', "wxyz");
        res.add("");
        for(int i=0; i<digits.length(); i++){
        	if(!map.containsKey(digits.charAt(i))){
        		continue;
        	}
        	ArrayList<String> res2 = new ArrayList<>();
        	for(String pre: res) {
        		String str = map.get(digits.charAt(i));
        		for(int j=0; j<str.length(); j++) {
        			res2.add(pre + str.charAt(j));
        		}
        	}
        	res = res2;
        }
		return res;
	}
	/**
	 * 22. Generate Parentheses
	 * @param n
	 * @return
	 */
	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
        if(n == 0){
        	return list;
        }
        parenthesisGenerater(list, "", n, n);
        return list;
    }
	private void parenthesisGenerater(List<String> list, String generated, int left, int right){
		if(left == 0 && right == 0){
			list.add(generated);
			return;
		}
		if(left > 0 && left <= right) {
			parenthesisGenerater(list, generated + "(", left-1, right);
		}
		if(right > 0 && left < right) {
			parenthesisGenerater(list, generated + ")", left, right-1);
		}
	}
	/**
	 * 49. Group Anagrams
	 * @param strs
	 * @return
	 */
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rst = new ArrayList<>();
        if(strs == null || strs.length == 0){
            return rst;
        }
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String key = new String(cs);
            if(!map.containsKey(key)){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }else{
                map.get(key).add(str);
            }
        }
        for(String key: map.keySet()){
            rst.add(map.get(key));
        }
        return rst;
    }

}
