class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i]-nums[i-1])>ans){
                ans=Math.abs(nums[i]-nums[i-1]);
            }
        }
        if(Math.abs(nums[0]-nums[nums.length-1])>ans){
            ans=Math.abs(nums[0]-nums[nums.length-1]);
        }
        return ans;
    }
}