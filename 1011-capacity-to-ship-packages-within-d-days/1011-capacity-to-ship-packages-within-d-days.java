class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = weights[0];
        int sum = 0;

        for(int weigh : weights){
            max = Math.max(max, weigh);
            sum += weigh;
        }

        int st = max;
        int end = sum;
        int ans = -1;
        while( st <= end){
            int mid = st + (end - st)/2;
            int totalDays = returnDays(weights, mid);

            if(totalDays > days){
                st = mid+1;
            }
            else {
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
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