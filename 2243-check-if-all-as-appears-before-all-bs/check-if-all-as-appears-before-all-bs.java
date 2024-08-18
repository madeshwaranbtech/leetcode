class Solution {
    public boolean checkString(String s) {
        int pos=0;
        int ca=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                ca++;
            }
        }
        if(ca==s.length()){
            return true;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                pos=i;
                break;
            }
        }
        boolean t=true;
        for(int i=pos+1;i<s.length();i++){
            if(s.charAt(i)=='a'){
                t=false;
                break;
            }
        }
        return t;
    }
}