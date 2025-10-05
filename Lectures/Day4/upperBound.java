class Solution {
    int upperBound(int[] arr, int target) {
        int lo=0;
        int  hi=arr.length-1;
        if(target>arr[hi]) return hi+1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(target<arr[mid]){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }
}
