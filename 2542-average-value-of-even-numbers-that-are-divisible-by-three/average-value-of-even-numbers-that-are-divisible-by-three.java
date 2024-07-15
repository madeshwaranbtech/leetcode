class Solution {
    public int averageValue(int[] nums) {
        int n=nums.length;
        int k=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0&&nums[i]%3==0){
                k=k+nums[i];
                c++;
            }
        }
        return c==0?0:k/c;
        
    }
}