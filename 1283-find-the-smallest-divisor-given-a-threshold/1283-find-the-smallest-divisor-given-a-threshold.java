class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for(int num : nums){
            max = Math.max(max, num);
        }

        int st = 1;
        int end = max;
        // int ans = -1;

        while(st <= end){
            int mid = st + (end-st)/2;
            int sum = 0;

            for(int i=0; i<nums.length; i++){
                sum += (nums[i] + mid-1)/mid; // Math.ceil also can be usable
            }
            if (sum <= threshold){
                // ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return st;
    }
}