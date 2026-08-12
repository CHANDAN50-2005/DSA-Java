class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // By kadane's algorithm

        for (int num : nums){        // iterate 
            sum += num;              // store the sum initially its a zero
            max = Math.max(max,sum);  // find max ele

            if(sum < 0) sum = 0;   // if the sum is less than 0, put 0
        }
        return max;
    }
}