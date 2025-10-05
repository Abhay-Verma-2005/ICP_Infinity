class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        int[][] arr=new int[val.length][2];
        for(int i=0;i<val.length;i++){
            arr[i][0]=val[i];
            arr[i][1]=wt[i];
        }
        int ans=0;
        Arrays.sort(arr, (a, b) -> Double.compare(
            (double)b[0]/b[1],
            (double)a[0]/a[1]
        ));

        for(int i=0;i<arr.length;i++){
            if(W>=arr[i][1]){
                ans+=arr[i][0];
                W-=arr[i][1];
            }
        }
        return ans;
        
    }
}

// Without dp
