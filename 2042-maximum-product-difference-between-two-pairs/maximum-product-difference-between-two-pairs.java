class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int m=nums[n-2]*nums[n-1];
        int a=nums[0]*nums[1];
        int c=Math.abs(m-a);
        return c;
    }
}