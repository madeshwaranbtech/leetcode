class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
           ArrayList<Character> li=new ArrayList<>();
            li.add(s.charAt(i));
            int j=i+1;
            while(j<n&&!li.contains(s.charAt(j))){
                li.add(s.charAt(j));
                j++;
            }
            max=Math.max(max,li.size());
        }
        return max;
        
    }
}
