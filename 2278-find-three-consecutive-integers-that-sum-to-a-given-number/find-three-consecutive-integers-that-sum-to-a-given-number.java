class Solution {
    public long[] sumOfThree(long num) {
        long n=num/3;
        long[] ans=new long[3];
        if(num%3!=0){
            return new long[] {};
        }
        ans[0]=n-1;
        ans[1]=n;
        ans[2]=n+1;
        return ans;
    }
}