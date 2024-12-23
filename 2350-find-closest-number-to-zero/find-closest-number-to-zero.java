class Solution {
    public int findClosestNumber(int[] nums) {
        int i=0;
        int v=0;
        Arrays.sort(nums);
        for(int j=0;j<nums.length;j++){
            if(j==0){
                i=Math.abs(nums[j]);
                v=nums[j];
            }
            else{
                if(i>=Math.abs(nums[j])){
                    i=Math.abs(nums[j]);
                    v=nums[j];
                }
            }
        }
        return v;
    }
}