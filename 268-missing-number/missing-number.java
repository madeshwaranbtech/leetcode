class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length+1;i++){
            sum=sum+i;
        }
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1 = sum1+nums[i];

        }
        int n = sum-sum1;
        return n;
    }
}