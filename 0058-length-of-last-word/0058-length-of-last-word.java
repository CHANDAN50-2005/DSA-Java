class Solution {
    public int lengthOfLastWord(String s) {
        String st = s.trim();  // removes the whitespace at the end
        int count = 0;

        for(int i=st.length()-1; i>=0; i--){
            if(st.charAt(i) != ' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}