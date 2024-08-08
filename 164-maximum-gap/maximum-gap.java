class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int min=0;
        for(int i=1;i<n;i++){
           int ans=Math.abs(nums[i]-nums[i-1]);
           if(ans>min){
            min=ans;
           }
        }
        return n>=2?min:0;

    }
}