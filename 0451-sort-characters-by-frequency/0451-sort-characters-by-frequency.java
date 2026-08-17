class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // 1. Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 2. Put characters into a list
        ArrayList<Character> chars = new ArrayList<>(map.keySet());

        // 3. Sort characters by frequency in decreasing order
        chars.sort((a, b) -> map.get(b) - map.get(a));

        // 4. Build answer
        StringBuilder result = new StringBuilder();

        for (char c : chars) {
            int frequency = map.get(c);

            for (int i = 0; i < frequency; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}