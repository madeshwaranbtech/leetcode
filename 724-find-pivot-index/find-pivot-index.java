class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int lsum=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            int rsum=0;
            for(int j=i+1;j<n;j++){
                rsum=rsum+nums[j];
            }
            if(lsum==rsum){
                ans=i;
                break;
            }
            lsum=lsum+nums[i];
        }
        return ans;
    }
}