class Solution {
    public int minimumPushes(String word) {
        // we can rearrage dailer pad anyway
        // 2-9 so the total keys are 8
        // place elements one by one on key
        // if 1-7 / 8 +1  means 1 push
        // if 8/8 +1 means 2 push
        int ans = 0;

        for(int i=0; i<word.length(); i++){
            ans += (i/8)+1; // till repeatation of ele the push will be 1 in add
        }
        return ans;
    }
}