class Solution {
    int targetindex = 0;
    public int threeSumClosest(int[] nums, int target) {
        // firstly finding the target index
        for(int i = 1; i < nums.length;i++){
            if(nums[i] == target){
                targetindex = i;
            }
        }
        if(nums[targetindex] + nums[targetindex-1] + nums[targetindex-2] == nums[targetindex=1]){
            
        }
    }
}
