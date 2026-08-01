class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int ans = -1;
        if(n < (m*k)) return -1;

        int min = bloomDay[0]; 
        int max = bloomDay[0];
        for(int day : bloomDay){
            if(day < min){
                min = day;
            }else if(day > max){
                max = day;
            }
        }

        while(min <= max){
            int mid = min +(max-min)/2;
            int bouquet = bouquetCount(bloomDay, mid, m, k);

            if(bouquet >= m){
                ans = mid;
                max = mid-1;
            }
            else if(bouquet < m){
                min = mid+1;
            }
        }
        return ans;
    }

    int bouquetCount(int [] bloomDay, int day, int m, int k){
        int count = 0;
        int bouquet = 0;

        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i] <= day){
                count++;
            }else{
                bouquet += count/k;
                count = 0;
            }
        }
        return bouquet += count/k;

        // if(bouquet >= m){
        //     return true;
        // }
        // return false;
    }
}