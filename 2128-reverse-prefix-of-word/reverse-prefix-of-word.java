class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        int c=0;
        String a="";
        String s="";
        for(int i=0;i<n;i++){
            if(word.charAt(i)==ch){
                c=i;
                break;
            }
        }
        if(c==0&&word.charAt(0)!=ch){
            return word;
        }
        for(int i=0;i<=c;i++){
            a=a+word.charAt(i);
        }
        for(int i=c+1;i<n;i++){
            s=s+word.charAt(i);
        }
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        return sb.toString()+s;
    }
}