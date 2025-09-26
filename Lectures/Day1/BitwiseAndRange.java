class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        //  c
        int c=0;
         while(right>left){
            left=left>>1;;
            right=right>>1;
            c++;
            }
        return left<<count;
        
        return right;
    }
}
