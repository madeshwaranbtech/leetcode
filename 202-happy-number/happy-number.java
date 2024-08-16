class Solution {
    public boolean isHappy(int n) {
        while(n!=1&&n!=4){
            int ans=0;
            while(n>0){
                int res=n%10;
                ans=ans+res*res;
                n=n/10;
            }
            n=ans;
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }
    }
}