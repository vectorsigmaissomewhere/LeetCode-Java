import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] outcome = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    outcome[0] = i;
                    outcome[1] = j;
                    return outcome;
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String[] elements = input.nextLine().split(" ");
        int size = elements.length;
        int nums[] = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(elements[i]);
        }
        int target = input.nextInt();

        Solution object = new Solution();
        int[] result = object.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}



"""
    INPUT
nums =
[3,3]
  TARGET
target =
6
OUTPUT
[0,1]

"""
