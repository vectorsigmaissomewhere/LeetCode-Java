import java.util.Scanner;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lennums1 = nums1.length;
        int lennums2 = nums2.length;
        int[] nums3 = new int[lennums1 + lennums2];
        System.arraycopy(nums1, 0, nums3, 0, lennums1);
        System.arraycopy(nums2, 0, nums3, lennums1, lennums2);

        for (int i = nums3.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums3[j] > nums3[j + 1]) {
                    int temp = nums3[j];
                    nums3[j] = nums3[j + 1];
                    nums3[j + 1] = temp;
                }
            }
        }

        int sizeofnum3 = nums3.length;
        double medianofthearray;
        if (sizeofnum3 % 2 == 0) {
            int mid1 = sizeofnum3 / 2;
            int mid2 = mid1 - 1;
            medianofthearray = (nums3[mid1] + nums3[mid2]) / 2.0;
        } else {
            medianofthearray = nums3[sizeofnum3 / 2];
        }

        return medianofthearray;
    }

    public static void main(String args[]) {
        Solution object = new Solution();
        Scanner input = new Scanner(System.in);
        String[] nums1element = input.nextLine().split(" ");
        int size = nums1element.length;
        int nums1[] = new int[size];
        for (int i = 0; i < size; i++) {
            nums1[i] = Integer.parseInt(nums1element[i]);
        }
        String[] nums2element = input.nextLine().split(" ");
        int size1 = nums2element.length;
        int nums2[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            nums2[i] = Integer.parseInt(nums2element[i]);
        }

        double medianofit = object.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianofit);
    }
}

"""
SOLVED THIS PROBLEM USING BUBBLE SORT ALGORITHM
  TIME COMPLEXITY O(N^2)
  INPUT
nums1 =
[1,2]
nums2 =
[3,4]
  OUTPUT
2.50000
"""
