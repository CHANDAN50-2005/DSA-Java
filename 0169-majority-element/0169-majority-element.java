class Solution {
    public int majorityElement(int[] nums) {
        int ele = 0;
        int count = 0;
        // By using Moore's voting algorithm

        for(int num : nums){  // iter throuh arr
            if(count == 0) ele = num;   // if there is no value in element add the num 
                                       // add fisrt itr num
            if(num == ele) count++; // num and ele is same so increment count
            else count --;         // if no match decrement the code 
        }
        return ele;
    }
}