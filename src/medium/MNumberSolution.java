package medium;

import java.util.Arrays;

import dataStructure.ListNode;

public class MNumberSolution {
	/**
	 * 2. Add Two Numbers  
	 * https://leetcode.com/problems/add-two-numbers/#/description
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pResult = result;
        ListNode pL1 = l1;
        ListNode pL2 = l2;
        int carry = 0;
        
        while(pL1 != null || pL2 != null){
        	carry /= 10;
        	if(pL1 != null){
        		carry += pL1.val;
        		pL1 = pL1.next;
        	}
        	if(pL2 != null){
        		carry += pL2.val;
        		pL2 = pL2.next;
        	}
        	pResult.next = new ListNode(carry % 10);
        	pResult = pResult.next;
        }
        if(carry / 10 == 1){
        	pResult.next = new ListNode(1);
        }
        return result.next;
    }
	/**
	 * 13. Roman to Integer   
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
		if(s == null) {
			return 0;
		}
		int result = 0;
		int[] iChar = new int[s.length()];
		for(int i=0; i<s.length(); i++) {
			switch(s.charAt(i)) {
			case 'I': iChar[i] = 1; break;
			case 'V': iChar[i] = 5; break;
			case 'X': iChar[i] = 10; break;
			case 'L': iChar[i] = 50; break;
			case 'C': iChar[i] = 100; break;
			case 'D': iChar[i] = 500; break;
			case 'M': iChar[i] = 1000; break; 
			}
		}
		for(int i=0; i<iChar.length-1; i++) {
			if(iChar[i] < iChar[i+1]) {
				result -= iChar[i];
			}else{
				result += iChar[i];
			}
		}
		result += iChar[iChar.length-1];
		return result;
	}
	/**
	 * 36. Valid Sudoku
	 * @param board
	 * @return
	 */
	public boolean isValidSudoku(char[][] board) {
        boolean[] visited = new boolean[9];
        //check row
        for(int i=0; i<9; i++){
            Arrays.fill(visited, false);
            for(int j=0; j<9; j++){
                if(!checkCell(visited, board[i][j])){
                    return false;
                }
            }
        }
        //check col
        for(int i=0; i<9; i++){
            Arrays.fill(visited, false);
            for(int j=0; j<9; j++){
                if(!checkCell(visited, board[j][i])){
                    return false;
                }
            }
        }
        //check sub
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                Arrays.fill(visited, false);
                for(int k=0; k<9; k++){
                    if(!checkCell(visited, board[i+ k/3][j + k%3])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private boolean checkCell(boolean[] visited, char cell){
        if(cell == '.'){
            return true;
        }
        int num = cell - '0';
        if(visited[num-1]){
            return false;
        }
        visited[num-1] = true;
        return true;
    }
    /**
     * 50. Pow(x, n)
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        boolean isNegative = false;
        if(n<0){
            isNegative = true;
        }
        int i = n / 2; //can not put Math.abs here, to avoid MIN_VALUE
        int j = n - 2 * i;
        double t1 = myPow(x, Math.abs(i)); 
        double t2 = myPow(x, Math.abs(j));
        double result = t1 * t1 * t2;
        if(isNegative){
            return 1 / result;
        }else{
            return result;
        }
    }
}
