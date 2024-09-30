class Solution {
    public boolean isValid(String word) {
        int count=0;
        int vowel=0;
        int constant=0;
        int symbols=0;
        int c1=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                vowel++;
            }
            else if (Character.isLetter(c)) {
                constant++;
            }
             else if (!Character.isLetterOrDigit(c)) {
                symbols++;
            }
        }
        if(word.length()>=3&&vowel>0&&constant>0&&symbols==0){
            return true;
        }
        else{
            return false;
        }
    }
}