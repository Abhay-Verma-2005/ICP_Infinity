// User function Template for Java

class Solution {
    int arraySum(int arr[]) {
        int ans=sum(arr,0);
        return ans;
    }
    public int sum(int[] arr,int i){
        if(i>=arr.length-1){
            return arr[0];
        }
        return sum(arr,++i)+arr[i];
    }
}
