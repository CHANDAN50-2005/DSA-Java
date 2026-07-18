class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return gcd(min, max);
    }
    int gcd(int a, int b){
        while( a != 0){ // runs until the min become 0
            int temp = a; // stores min value so, it can be accessible as a max val laterfor gcd
            a = b % a; // checks for the gcd modulo remaibder val
            b = temp; // accessed as a max gcd
        }
        return b;  // return gcd
    }
}