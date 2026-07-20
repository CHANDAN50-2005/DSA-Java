class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }
        }
    }
    void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
// 0 - low-1; low - mid-1; mid - high-1; high - n-1.
// 0 always first, 1 is mid, 2 is end.
// just need to sort at middle element at 1st or end.