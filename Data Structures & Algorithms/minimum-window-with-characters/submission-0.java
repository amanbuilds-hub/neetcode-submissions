

class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // Store frequency of chars in t
        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        int have = 0;
        int need = countT.size();

        int left = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            // Add current char to window
            window.put(c, window.getOrDefault(c, 0) + 1);

            // Check if frequency matches
            if (countT.containsKey(c) &&
                window.get(c).intValue() == countT.get(c).intValue()) {

                have++;
            }

            // Try shrinking window
            while (have == need) {

                // Update minimum window
                int windowLen = right - left + 1;

                if (windowLen < minLen) {
                    minLen = windowLen;
                    start = left;
                }

                // Remove left char
                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar) - 1);

                // If frequency becomes invalid
                if (countT.containsKey(leftChar) &&
                    window.get(leftChar) < countT.get(leftChar)) {

                    have--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}
