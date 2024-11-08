class Solution {
    public int findComplement(int num) {
        String m=Integer.toBinaryString(num);
        String m1="";
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)=='0'){
                m1+="1";
            }
            else{
                m1+="0";
            }
        }
        int ans=Integer.parseInt(m1,2);
        return ans;
    }
}