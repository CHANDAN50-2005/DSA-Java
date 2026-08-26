class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        
        return (n & n-1)==0;
        //using and operator
        // (8 & 7) which represented in bits
        // 1000 & 0111 results 0
    }
}