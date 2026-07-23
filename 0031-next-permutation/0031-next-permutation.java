class Solution {
    public void nextPermutation(int[] nums) {
        int pivot =-1;
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            int st = 0;
            int end = nums.length-1;
            while(st <= end){
                swap(nums,st,end);
                st++;
                end--;
            }
        }
        else{
            int second = 0;
            for(int j = nums.length-1; j > pivot; j--){
                if(nums[j] > nums[pivot]){
                    second = j;
                    break;
                }
            }
            swap(nums,pivot,second);
            int m = pivot+1;
            int n = nums.length-1;
            while(m < n){
                swap(nums,m,n);
                m++;
                n--;
            }

        }
                
    }
    void swap(int [] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}