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

            // Add half of the occurrences to the left half
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) (i + 'a'));
            }

            // Odd frequency character becomes the middle
            if (freq[i] % 2 == 1) {
                middle = String.valueOf((char) (i + 'a'));
            }
        }

        // Right half is reverse of left half
        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + middle + right;
    }
}