class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character, Character> isoMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(isoMap.containsKey(s.charAt(i))){
                if(!isoMap.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }else{
                if(isoMap.containsValue(t.charAt(i))){
                    return false;
                }
            }
            isoMap.put(s.charAt(i), t.charAt(i));
        }
        return true;    
    }
}