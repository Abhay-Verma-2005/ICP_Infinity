class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            int i = 0, n = arr[j].length - 1;
            while (i <= n) {
                int temp;
                if(arr[j][i]==0){
                    temp = 1; 
                }
                else{
                    temp=0;
                }
                if(arr[j][n]==0){
                    arr[j][i] = 1; 
                }
                else{
                    arr[j][i]=0;
                }
                arr[j][n] = temp;
                i++;
                n--;
            }
        }
        return arr;
    }
}
