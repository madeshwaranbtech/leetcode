class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length();
        int count=0;
        for(int i=n-1;i>=0;i--){
            if(num.charAt(i)!='0'){
                break;
            }
            count++;
        }
        String mad="";
        for(int i=0;i<n-count;i++){
            mad=mad+num.charAt(i);
        }
        return mad;
    }
}