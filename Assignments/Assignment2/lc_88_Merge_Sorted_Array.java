class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[n+m];
        int curr=0;
        for(int i=0;i<m;i++){
            arr[curr]=nums1[i];
            curr++;
        }
        for(int i=0;i<n;i++){
            arr[curr]=nums2[i];
            curr++;
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=arr[i];
        }  
        Arrays.sort(nums1);    
    }
}

\
