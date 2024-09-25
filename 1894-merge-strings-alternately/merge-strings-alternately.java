class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        String ans1="";
        int a=0,b=0;
        String ans2="";
        String ans3="";
        if(word1.length()==word2.length()){
            for(int i=0;i<word1.length()+word2.length();i++){
                if(i%2==0){
                    ans1=ans1+word1.charAt(a);
                    a++;
                }
                else{
                    ans1=ans1+word2.charAt(b);
                    b++;
                }
            }
            ans=ans1;
        }
        else if(word1.length()<word2.length()){
            String mad="";
            String rem="";
            for(int i=0;i<word1.length();i++){
                mad=mad+word2.charAt(i);
            }
            for(int i=word1.length();i<word2.length();i++){
                rem=rem+word2.charAt(i);
            }
            for(int i=0;i<word1.length()+mad.length();i++){
                if(i%2==0){
                    ans1=ans1+word1.charAt(a);
                    a++;
                }
                else{
                    ans1=ans1+mad.charAt(b);
                    b++;
                }
            }
            ans1=ans1+rem;
            ans=ans1;

        }
        else{
            String mad="";
            String rem="";
            for(int i=0;i<word2.length();i++){
                mad=mad+word1.charAt(i);
            }
            for(int i=word2.length();i<word1.length();i++){
                rem=rem+word1.charAt(i);
            }
            for(int i=0;i<mad.length()+word2.length();i++){
                if(i%2==0){
                    ans1=ans1+mad.charAt(a);
                    a++;
                }
                else{
                    ans1=ans1+word2.charAt(b);
                    b++;
                }
            }
            ans1=ans1+rem;
            ans=ans1;
        }
        return ans;
    }
}