class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        // Step 1: Find the first decreasing element from the end
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // Step 2: If such an element was found, find the element just larger than it to swap with
        if (i >= 0) {
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        
        // Step 3: Reverse the elements after the position i to get the next permutation
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
/*
Algorithm type : Lexicographical order permutation generation
Steps : Find the pivot, find the swap candidate, swap, and reverse the suffix
Complexity : O(n)

/////////////////////STEPS//////////////////////////
Find the First Decreasing Element:

Start from the end: Compare 3 (index 2) with 2 (index 1): 3 > 2.
Compare 2 (index 1) with 1 (index 0): 2 > 1.
i = 1 (element 2 is the pivot).
Find the Element to Swap With:

Traverse from the end to find the first element greater than 2.
3 (index 2) is greater than 2.
j = 2.
Swap Elements:

Swap 2 (index 1) with 3 (index 2).
Array becomes: nums = {1, 3, 2}.
Reverse the Suffix:

Reverse elements to the right of index 1.
The subarray {2} remains {2} since it has only one element.
Final array: nums = {1, 3, 2} (next permutation).




*/
