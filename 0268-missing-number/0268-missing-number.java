class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        // n*(n+1)/2 calculates the sum till n
        int expected = n*(n+1)/2;
        int actual = 0;

        for (int num : nums){
            actual += num;
        }
        return expected-actual;
    }
}