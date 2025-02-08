class Solution {
    public String getEncryptedString(String s, int k) {
        String ans="";
        for(int i=0;i<s.length();i++){
            int a=(i+k)%s.length();
            ans+=s.charAt(a);
        }
        return ans;
    }
}