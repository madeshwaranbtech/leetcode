class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int a = 0; 
        for (int i = 0; i < s.length(); i++) {
            if (a < spaces.length && i == spaces[a]) {
                ans.append(" ");
                a++;
            }
            ans.append(s.charAt(i));
        }
        
        return ans.toString();
    }
}
