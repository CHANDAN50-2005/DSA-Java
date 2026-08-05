class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int st = weights[0];       // max of arr to start
        int end = 0;         // sum of arr

        for(int weigh : weights){
            st = Math.max(st, weigh);
            end += weigh;
        }

        // int ans = -1;
        while( st <= end){
            int mid = st + (end - st)/2;
            int totalDays = returnDays(weights, mid);

            if(totalDays > days){
                st = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return st;
    }

    int returnDays(int [] weights, int cap){
        int day = 1; 
        int count = 0;
        
        for(int weigh : weights){
            if(count + weigh > cap){
                day++;
                count = weigh;
            }else{
                count += weigh;
            }
        }
        return day;
    }
}