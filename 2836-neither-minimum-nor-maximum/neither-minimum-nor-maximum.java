class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<=2){
            return -1;
        }
        else{
            return nums[1];
        }
    }
}