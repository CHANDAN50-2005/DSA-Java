class Solution {
    public int findMin(int[] nums) {
        int smallest = pivotEl(nums);
        if (smallest == -1){  // beacause -1 means arr is sorted
            return nums[0];   // sorted so simply return 1st element
        }
        return smallest;
    }
    int pivotEl(int [] nums){
        int st = 0; 
        int end = nums.length-1;

        while(st <= end){
            int mid = st + (end-st)/2;

            if (mid < end && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            if (mid > st && nums[mid] < nums[mid-1]){
                return nums[mid];
            }
            if(nums[st] >= nums[mid]){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return -1;
    }
}