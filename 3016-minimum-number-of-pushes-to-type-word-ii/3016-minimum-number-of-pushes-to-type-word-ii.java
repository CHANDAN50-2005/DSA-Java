class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        for(char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        } 

        Arrays.sort(freq);

        int index = 0;
        int ans = 0;
        for(int i=25; i>=0; i--){
            if(freq[i] == 0) continue;

            int pushes = (index/8)+1;
            ans += freq[i] * pushes;

            index++;
        }
        return ans;
    }
}