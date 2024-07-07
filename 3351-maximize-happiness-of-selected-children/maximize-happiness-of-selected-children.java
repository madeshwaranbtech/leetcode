class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        Arrays.sort(happiness);
        int sum=0;
        int dec=0;
        long res=0;
        for(int i=n-1;i>=n-k;i--){
            sum=happiness[i]-dec;
            dec++;
            if(sum>0){
                res+=sum;
            }
        }
        return res;
    }
}