class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st= 1;
        int end = piles[0];
        for(int num : piles){   // find max, so the k will be in that range
            end = Math.max(end, num);
        }

        int ans = end;

        while(st <= end){
            int mid = st + (end - st)/2;
            long totalHrs = total(piles, mid);  // long to store large int values

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
            hrs += (num + mid-1L)/mid; // ciel the value beacuse the koko wont go another pile before finishing it
            // 1L to perform entire expression in long
        }
        return hrs;
    }
}