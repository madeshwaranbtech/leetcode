class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        ArrayList<Character> li = new ArrayList<>();
        HashSet<Character> vowels = new HashSet<>(Arrays.asList(
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
        ));
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (vowels.contains(c)) {
                li.add(c);
            }
        }
        Collections.reverse(li);
        StringBuilder ans = new StringBuilder();
        int a = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!vowels.contains(c)) {
                ans.append(c);
            } else {
                ans.append(li.get(a));
                a++;
            }
        }
        
        return ans.toString();
    }
}
