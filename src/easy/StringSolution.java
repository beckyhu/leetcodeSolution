package easy;

import java.util.HashMap;
import java.util.Map;

public class StringSolution {
	/*
	 * 344. Reverse String Write a function that takes a string as input and
	 * returns the string reversed.
	 * https://leetcode.com/problems/reverse-string/
	 */
	public String reverseString(String s) {
		if (s == null) {
			return s;
		}
		char[] cArr = s.toCharArray();

		int cArrLength = cArr.length;
		char temp;
		for (int i = 0; i < cArrLength / 2; i++) {
			temp = cArr[i];
			cArr[i] = cArr[cArrLength - 1 - i];
			cArr[cArrLength - 1 - i] = temp;
		}
		return String.valueOf(cArr);
	}

	/*
	 * 6. ZigZag Conversion The string "PAYPALISHIRING" is written in a zigzag
	 * pattern on a given number of rows like this: (you may want to display
	 * this pattern in a fixed font for better legibility)
	 * https://leetcode.com/problems/zigzag-conversion/
	 * eg. input: "PAYPALISHIRING", numRows: 3
	 * zipZag: P   A   H   N
	 * 		   A P L S I I G
	 * 	       Y   I   R
	 *     output: "PAHNAPLSIIGYIR"
	 */
	public String zigZagConverte(String s, int numRows) {
		//1. construct a map, key: 1..numRows, value:StringBuilder to append the single char,
		// create an int array, which contains the key sequence to put each char of the input string
		int zigLength = numRows * 2 - 2;
		int[] indexArr = new int[zigLength];
		for (int i = 0; i < zigLength; i++) {
			if (i < numRows) {
				indexArr[i] = i + 1;
			} else {
				indexArr[i] = numRows - (i - numRows) - 1;
			}
		}
		Map<Integer, StringBuilder> map = new HashMap<Integer, StringBuilder>();
		for(int i = 1; i<=numRows; i++) {
			map.put(i, new StringBuilder());
		}
		//2. append each char on corresponding entry's StringBuilder
		char[] chars = s.toCharArray();
		int index = 0;
		for(int i=0; i<chars.length; i++) {
			int key = indexArr[index];
			map.get(key).append(chars[i]);
			index++;
			if(index == indexArr.length)
			{
				index = 0;
			}
		}
		//3. connect all entry's StringBuilder into one as result
		StringBuilder resultStr = new StringBuilder();
		for(int i=1; i<=numRows; i++) {
			resultStr.append(map.get(i).toString());
		}

		return resultStr.toString();
	}
}
