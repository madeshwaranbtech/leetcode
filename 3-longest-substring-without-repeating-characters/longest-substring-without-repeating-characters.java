class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // Remove characters from the set until the duplicate character is removed
            while (set.contains(currentChar)) {
                set.remove(s.charAt(start));
                start++;
            }

            // Add the current character to the set
            set.add(currentChar);

            // Update the maximum length found
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}