class Solution {
    public boolean isIsomorphic(String s, String t) {

        // create the empty arr index 0,255
        int[] mapS = new int[256]; 
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Checks for ASCII values (a=97)
            if (mapS[sChar] != mapT[tChar]) {
                return false;
            }

            mapS[sChar] = i + 1;
            mapT[tChar] = i + 1;
        }
        return true;
    }
}