package medium;

import java.util.ArrayList;
import java.util.List;

public class MArraySolution {
	/**
	 * 46. Permutations   
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rst = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0){
            rst.add(list);
            return rst;
        }
        permuteHelper(rst, list, nums);
        return rst;
    }
    
    private void permuteHelper(List<List<Integer>> rst, ArrayList<Integer>list, int[] nums) {
        if(nums.length == list.size()){
            rst.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            permuteHelper(rst, list, nums);
            list.remove(list.size() - 1);
        }
    }
    /**
     * 48. Rotate Image
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length <= 1){
            return;
        }
        int n = matrix.length;
        for(int i=0; i<n/2; i++){
            for(int j=0; j<n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-i-1][j];
                matrix[n-i-1][j] = tmp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
    /**
     * 54. Spiral Matrix 
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
    	ArrayList<Integer> rst = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return rst;
        }
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;
        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i=colStart; i<=colEnd; i++){
            rst.add(matrix[rowStart][i]);
            }
            rowStart++;
            for(int i=rowStart; i<=rowEnd; i++){
                rst.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowStart <= rowEnd){
                for(int i=colEnd; i>=colStart; i--){
                rst.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            if(colStart <= colEnd){
                for(int i=rowEnd; i>=rowStart; i--){
                rst.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }
        
        return rst;
    }
    /**
     * 55. Jump Game
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        if(nums.length == 1 && nums[0] > 0){
            return true;
        }
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] == 0){
                int jump = 1;
                while(jump > nums[i]){
                    i--;
                    jump++;
                    if(i < 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    /**
     * 62. Unique Paths
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        if(m == 0 || n == 0){
            return 1;
        }
        int[][] paths = new int[m][n];
        for(int i=0; i<m; i++){
            paths[i][0] = 1;
        }
        for(int i=0; i<n; i++){
            paths[0][i] = 1;
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                paths[i][j] = paths[i-1][j] + paths[i][j-1];
            }
        }
        return paths[m-1][n-1];
    }
    /**
     * 73. Set Matrix Zeroes
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        boolean empty_row0 = false;
        boolean empty_col0 = false;
        for(int i = 0; i < cols; i++){
            if(matrix[0][i] == 0){
                empty_row0 = true;
                break;
            }
        }
        
        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == 0){
                empty_col0 = true;
                break;
            }
        }
        
        for(int i = 1; i < rows; i++) {
            for(int j =1; j<cols; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i = 1; i<rows; i++) {
            for (int j=1; j< cols; j++) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
            }
        }
      
        if(empty_row0){
            for(int i = 0; i < cols; i++){
                matrix[0][i] = 0;
            }           
        }
        
        if(empty_col0){
            for(int i = 0; i < rows; i++){
                matrix[i][0] = 0;
            }           
        }
    }
    /**
     * 75. Sort Colors
     * @param nums
     */
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int p0 = 0;
        int p2 = nums.length-1;
        int i = 0;
        while(i <= p2){
            if(nums[i] == 0){
                swap(nums, i, p0);
                p0++;
                i++;
            }else if(nums[i] == 1){
                i++;
            }else{
                swap(nums, i, p2);
                p2--;
            }
        }
    }
    private void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    /**
     * 79. Word Search
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0){
            return false;
        }
        if(word.length() == 0){
            return true;
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean rst = searchWord(board, word, i, j, 0);
                    if(rst){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean searchWord(char[][] board, String word, int i, int j, int start){
        if(start == word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] != word.charAt(start)){
            return false;
        }
        board[i][j] = '#';
        boolean rst = searchWord(board, word, i+1, j, start+1) || searchWord(board, word, i-1, j, start+1)
            || searchWord(board, word, i, j+1, start+1) || searchWord(board, word, i, j-1, start+1);
        board[i][j] = word.charAt(start);
        return rst;
    }
}
