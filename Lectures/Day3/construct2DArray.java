class Solution {
    public int[][] construct2DArray(int[] original, int n, int m) {
        if(original.length != n*m){
            return new int[][] {};
        }
        int [][] arr =new int[n][m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=original[k];
                k++;
            }
        }
        return arr;
    }
}
