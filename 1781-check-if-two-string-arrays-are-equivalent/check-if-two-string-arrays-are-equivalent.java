class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n=word1.length;
        int m=word2.length;
        String s="";
        String t="";
        for(int i=0;i<n;i++){
            s=s+word1[i];
        }
        for(int i=0;i<m;i++){
            t=t+word2[i];
        }
        if(s.equals(t)){
            return true;
        }
        else{
            return false;
        }

    }
}