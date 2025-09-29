class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> r= new HashSet<>();
        Set<Integer> c= new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int row:r){
            rowzero(matrix,row);
        }
        for(int col:c){
            colzero(matrix,col);
        }

    }
    private void rowzero(int[][] arr, int row){
        for(int i=0;i<arr[row].length;i++){
            arr[row][i]=0;
        }
    }
    private void colzero(int[][] arr, int col){
        for(int i=0;i<arr.length;i++){
            arr[i][col]=0;
        }
    }
}
