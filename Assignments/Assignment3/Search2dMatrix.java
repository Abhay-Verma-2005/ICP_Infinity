class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
        int e=matrix[0].length-1;
        while(s<matrix.length && e>=0){
            int mid=matrix[s][e];
            if(mid==target) return true;
            if(mid>target){
                e--;
            }
            else{
                s++;
            }
        }
        return false;
    
    }
}
