import java.util.*;
class Solution {
    public int majorityElement(int[] arr) {
        int ans = arr[0] ,freq = 1;
        for(int i=1; i<arr.length ;i++){
            if(freq==0){
                    ans=arr[i];
                    freq=1;
                }
            if(arr[0]==ans){
                freq++;
            }

            else{
                freq--;
                
            }
        }
        return ans;
    }
}
