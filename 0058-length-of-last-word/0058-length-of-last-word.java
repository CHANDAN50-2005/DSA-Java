class Solution {
    public int lengthOfLastWord(String s) {
        
        // without using trim()

        int count = 0;
        if(s == null || s.length() == 0) return 0;

        int n = s.length()-1;
        while(n >= 0 && s.charAt(n) == ' '){
                n--;
        }
        while(n >= 0 && s.charAt(n) != ' '){
            count++;
            n--;
        }
        return count;
    }
}