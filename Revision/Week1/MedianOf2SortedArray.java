class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr= new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length+nums2.length;i++){
            if(i<nums1.length){
                arr[i]=nums1[i];
            }else{
                arr[i]=nums2[i-nums1.length];
            }
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            return (double) (arr[arr.length/2]+arr[(arr.length/2)-1])/2;
        }
        else{
            return (double) arr[(arr.length/2)];
        }

    }
}