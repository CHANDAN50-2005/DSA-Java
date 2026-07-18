class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_count = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            if(max_count < count){
                max_count = count;
            }
        }
        return max_count;
    }
}