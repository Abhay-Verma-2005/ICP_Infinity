class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        Arrays.sort(arr); // sort array for binary search
        int lo=1;
        int hi = arr[arr.length-1]; // yaha per array ki max value
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(check(arr,mid)>h){  // har value ko check krnge max se lekr 1 tak ki range m
                lo=mid+1;
            }
            else{
                hi = mid;
            }
        }
        return lo;
    }
    public int check(int[] arr,int val){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int p=(arr[i]/val);
            int q=(arr[i]%val);
            if(q!=0){
                p++;
            }
            count+=p;
        }
        return count;
    }
}
