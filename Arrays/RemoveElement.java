class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // The length of the array after removing elements

        // Iterate over all elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, copy it to the front
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Return the length of the array after removing elements
        return k;
    }
}


/*

O(n) complexity

Initial State:

nums = {3, 2, 2, 3}
val = 3
k = 0

Iteration Steps:

i = 0: nums[0] == 3 → Do nothing
i = 1: nums[1] == 2 → nums[0] = nums[1] → nums = {2, 2, 2, 3}, k = 1
i = 2: nums[2] == 2 → nums[1] = nums[2] → nums = {2, 2, 2, 3}, k = 2
i = 3: nums[3] == 3 → Do nothing


Final State:

nums = {2, 2, 2, 3}
k = 2 (number of elements not equal to val)


Result:

The first k elements of the array nums are {2, 2}.
The function returns k = 2.

*/
