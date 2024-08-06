class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String m=words[i];
            int n=m.length();
            if(m.charAt(0)=='a'||m.charAt(0)=='e'||m.charAt(0)=='i'||m.charAt(0)=='o'||m.charAt(0)=='u'||m.charAt(0)=='A'||m.charAt(0)=='E'||m.charAt(0)=='I'||m.charAt(0)=='O'||m.charAt(0)=='U'){
                if(m.charAt(n-1)=='a'||m.charAt(n-1)=='e'||m.charAt(n-1)=='i'||m.charAt(n-1)=='o'||m.charAt(n-1)=='u'||m.charAt(n-1)=='A'||m.charAt(n-1)=='E'||m.charAt(n-1)=='I'||m.charAt(n-1)=='O'||m.charAt(n-1)=='U'){
                    count++;
                }

            }
        }
        return count;
    }
}