class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set <Integer> numSet = new HashSet<>(n);

        for(int i=0; i<n; i++){
            if(numSet.contains(nums[i])){
                return true;
            }
            numSet.add(nums[i]);
        }
        return false;
    }
}