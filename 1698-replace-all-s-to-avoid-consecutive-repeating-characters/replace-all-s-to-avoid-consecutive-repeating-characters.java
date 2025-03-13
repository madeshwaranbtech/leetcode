class Solution {
    public String modifyString(String s) {
        char c='a';
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='?'){
            while(i>0&&sb.charAt(i-1)==c||i<s.length()-1&&sb.charAt(i+1)==c){
                c++;
                if(c>'z'){
                    c='a';
                }
            }
             sb.setCharAt(i, c);
            }
        }
        return sb.toString();
    }
}