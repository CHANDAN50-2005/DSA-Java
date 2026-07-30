class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st= 1;
        int end = piles[0];
        for(int num : piles){
            end = Math.max(end, num);
        }
        int ans = end;

        while(st <= end){
            int mid = st + (end - st)/2;
            long totalHrs = total(piles, mid);

            if(totalHrs <= h){
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }

    long total(int[] piles, int mid){
        long hrs = 0;

        for(int num : piles){
            hrs += (num + mid-1L)/mid;
        }
        return hrs;
    }
}