class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String st = strs[0];
        String end = strs[strs.length-1];
        int index = 0;

        while(index < st.length()){
            if(st.charAt(index) == end.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return index==0?"" : st.substring(0,index); 
    }
}