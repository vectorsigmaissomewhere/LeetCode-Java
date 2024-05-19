// two pointer algorithm used
// slow-fast pointer technique which is commomnly used for array modifications
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniqueIndex = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { //  condition check
                nums[uniqueIndex] = nums[i]; //swapping
                uniqueIndex++;
            }
        }
        
        return uniqueIndex;
    }
}
// using this you can find how many unique items are there in a list
// using this you can get the unique items
// for example list be nums = {1, 1, 2, 2, 3, 4, 4, 5}
// output as {1,2,3,4,5,4,4,5}

// O(n) complexity

/*
Iteration Steps:
Iteration 1 (i = 1):

Current Element: nums[1] = 1
Previous Element: nums[0] = 1
Condition Check: nums[1] != nums[0] → 1 != 1 is false
Action: No action, move to the next element.
Iteration 2 (i = 2):

Current Element: nums[2] = 2
Previous Element: nums[1] = 1
Condition Check: nums[2] != nums[1] → 2 != 1 is true
Action:
Place nums[2] at nums[uniqueIndex]
nums[1] = nums[2] → nums = {1, 2, 2, 2, 3, 4, 4, 5}
Increment uniqueIndex → uniqueIndex = 2
Iteration 3 (i = 3):

Current Element: nums[3] = 2
Previous Element: nums[2] = 2
Condition Check: nums[3] != nums[2] → 2 != 2 is false
Action: No action, move to the next element.
Iteration 4 (i = 4):

Current Element: nums[4] = 3
Previous Element: nums[3] = 2
Condition Check: nums[4] != nums[3] → 3 != 2 is true
Action:
Place nums[4] at nums[uniqueIndex]
nums[2] = nums[4] → nums = {1, 2, 3, 2, 3, 4, 4, 5}
Increment uniqueIndex → uniqueIndex = 3
Iteration 5 (i = 5):

Current Element: nums[5] = 4
Previous Element: nums[4] = 3
Condition Check: nums[5] != nums[4] → 4 != 3 is true
Action:
Place nums[5] at nums[uniqueIndex]
nums[3] = nums[5] → nums = {1, 2, 3, 4, 3, 4, 4, 5}
Increment uniqueIndex → uniqueIndex = 4
Iteration 6 (i = 6):

Current Element: nums[6] = 4
Previous Element: nums[5] = 4
Condition Check: nums[6] != nums[5] → 4 != 4 is false
Action: No action, move to the next element.
Iteration 7 (i = 7):

Current Element: nums[7] = 5
Previous Element: nums[6] = 4
Condition Check: nums[7] != nums[6] → 5 != 4 is true
Action:
Place nums[7] at nums[uniqueIndex]
nums[4] = nums[7] → nums = {1, 2, 3, 4, 5, 4, 4, 5}
Increment uniqueIndex → uniqueIndex = 5
Final State:
Modified Array: nums = {1, 2, 3, 4, 5, 4, 4, 5}
Unique Elements: The first 5 elements {1, 2, 3, 4, 5} are unique.
Return Value: uniqueIndex = 5

*/
