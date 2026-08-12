class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if(n < 2) return false;
        Set <Integer> numSet = new HashSet<>(n);

        for(int i=0; i<n; i++){
            if(!numSet.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}