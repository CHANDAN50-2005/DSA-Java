class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[r].length-1; // matrix[r] because to calculate the particular rows lwngth

        while(r < matrix.length && c >=0){
            if (matrix[r][c] == target){
                return true;
            }
            if(matrix[r][c] > target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}