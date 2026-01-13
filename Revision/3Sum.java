import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); 
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; 

            twoSum(nums, i, result);
        }
        return result;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> result) {
        int l = i + 1, h = nums.length - 1;
        while (l < h) {
            int sum = nums[i] + nums[l] + nums[h];

            if (sum == 0) {
                result.add(Arrays.asList(nums[i], nums[l], nums[h]));
                while (l < h && nums[l] == nums[l + 1]) l++;
                while (l < h && nums[h] == nums[h - 1]) h--;

                l++;
                h--;
            } else if (sum < 0) {
                l   ++;
            } else {
                h--;
            }
        }
    }
}
