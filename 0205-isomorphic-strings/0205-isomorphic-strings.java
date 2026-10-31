class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int[] a=new int[256];
        int[] b=new int[256];
        for (int i=0;i<n;i++)
        {
            int ch1=s.charAt(i);
            int ch2=t.charAt(i);
            if (a[ch1]!=b[ch2])
            {
                return false;
            }
            a[ch1]=i+1;
            b[ch2]=i+1;
        }
        return true; 
    }
}