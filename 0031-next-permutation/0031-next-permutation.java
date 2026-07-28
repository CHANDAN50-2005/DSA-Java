class Solution {
    public void nextPermutation(int[] nums) {

        // Find the pivot (first decreasing element from the right) num < num+1...
        int pivot = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // No pivot => Largest permutation, so reverse the whole array
        if (pivot == -1) {

            int st = 0;
            int end = nums.length - 1;

            while (st < end) {
                swap(nums, st, end);
                st++;
                end--;
            }
        } else {

            // Find the next greater element from the right
            int second = 0;

            for (int j = nums.length - 1; j > pivot; j--) {
                if (nums[j] > nums[pivot]) {
                    second = j;
                    break;
                }
            }

            // Swap pivot with next greater element
            swap(nums, pivot, second);

            // Reverse the suffix to get the smallest order
            int st = pivot + 1;
            int end = nums.length - 1;

            while (st < end) {
                swap(nums, st, end);
                st++;
                end--;
            }
        }
    }

    // Utility method to swap two elements
    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}