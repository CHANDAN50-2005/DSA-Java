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
            int totalDays = daysRequired(weights, mid);

            if(totalDays > days){
                st = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return st;
    }

    int daysRequired(int [] weights, int cap){
        int day = 1; 
        int countLoad = 0;
        
        for(int weigh : weights){
            if(countLoad + weigh > cap){
                day++;
                countLoad = weigh;
            }else{
                countLoad += weigh;
            }
        }
        return day;
    }
}