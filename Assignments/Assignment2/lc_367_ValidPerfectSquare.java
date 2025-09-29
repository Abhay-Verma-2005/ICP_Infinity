class Solution {
    public boolean isPerfectSquare(int num) {
        if (num<2) return true;
        int lo=2;
        int hi=num/2;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long a=(long)mid*mid;
            if(a==num) return true;
            else if(a<num){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return false;

    }
}
