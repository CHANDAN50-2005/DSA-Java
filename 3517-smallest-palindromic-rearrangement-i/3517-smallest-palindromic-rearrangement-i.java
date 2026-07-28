class Solution {
    public String smallestPalindrome(String s) {

        // Count frequency of each character
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        String middle = "";

        // Build left half and find middle character
        for (int i = 0; i < 26; i++) {

            // Add half of each character to the left half
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) (i + 'a'));
            }

            // Store the odd frequency character as the middle
            if (freq[i] % 2 == 1) {
                middle = String.valueOf((char) (i + 'a'));
            }
        }

        // Build the final answer
        StringBuilder ans = new StringBuilder(left);

        ans.append(middle);

        // Mirror the left half
        for (int i = left.length() - 1; i >= 0; i--) {
            ans.append(left.charAt(i));
        }

        return ans.toString();
    }
}