class Solution {
    public int[] evenOddBit(int n) {
        String d=Integer.toBinaryString(n);
        int[] ans=new int[2];
        int e=0;
        int o=0;
        for(int i=d.length()-1;i>=0;i--){
            if(d.charAt(i)=='1'){
                if((d.length()-1-i)%2==0){
                    e++;
                }
                else{
                    o++;
                }
            }
        }
        ans[0]=e;
        ans[1]=o;
        return ans;
    }
}