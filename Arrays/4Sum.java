import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicates
                }
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long summation = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if (summation == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++; // Skip duplicates
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--; // Skip duplicates
                        }
                        left++;
                        right--;
                    } else if (summation < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
/*
nums =
[1,0,-1,0,-2,2]
output
[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
*/
