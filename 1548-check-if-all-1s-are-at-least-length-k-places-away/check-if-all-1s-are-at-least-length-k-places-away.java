class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int last=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                if(last!=-1&&i-last-1<k){
                    return false;
                }
                last=i;
            }
        }
        return true;
    }
}