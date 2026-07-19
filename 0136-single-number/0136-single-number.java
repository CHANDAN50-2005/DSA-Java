class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int n : nums){
            //ans = ans ^ n;
            ans^= n;  // xor which cancel out the same num
                      // a^a = 0, a^0=a, 2^3^3 = 2
        }
        return ans;
    }
}