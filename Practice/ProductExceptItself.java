class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]=1;
        int pro=1;
        for(int i=1;i<n;i++){ 
            pro=arr[i-1]*left[i-1];
            left[i]=pro;
        }
        right[n-1]=1;
        int pro2=1;
        for(int i=n-2;i>=0;i--){  
            pro2=arr[i+1]*right[i+1];  
            right[i] = pro2;
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int  t= right[i]*left[i];
            ans[i]=t;
        }
        return ans;
    }
}
