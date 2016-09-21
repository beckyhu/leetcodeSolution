package easy;

public class StringSolution {
	/*
	 * 344. Reverse String
	 * Write a function that takes a string as input and returns the string reversed.
	 * https://leetcode.com/problems/reverse-string/
	 */
	public String reverseString(String s) {
        if(s == null){
        	return s;
        }
        char[] cArr = s.toCharArray();
        System.out.println(String.valueOf(cArr));
        int cArrLength = cArr.length;
        char temp;
        for(int i = 0; i < cArrLength / 2; i++) {
        	temp = cArr[i];
        	cArr[i] = cArr[cArrLength -1 - i];
        	cArr[cArrLength - 1 - i] = temp;
        }
        return String.valueOf(cArr);
    }
	
	/*
	 * 6. ZigZag Conversion
	 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
	 * https://leetcode.com/problems/zigzag-conversion/
	 */
	public String zigZagConverte(String s, int numRows) {
		
		return "";
	}
}
