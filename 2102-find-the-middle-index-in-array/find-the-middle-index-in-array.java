class Solution {
    public int findMiddleIndex(int[] nums) {
        int ans=-1;
        if(nums.length==1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            int sum1=0;
            int sum2=0;
            for(int k=i-1;k>=0;k--){
                sum1+=nums[k];
            }
            for(int j=i+1;j<nums.length;j++){
                sum2+=nums[j];
            }
            if(sum1==sum2){
                ans=i;
                break;
            }
        }
        return ans;
    }
}