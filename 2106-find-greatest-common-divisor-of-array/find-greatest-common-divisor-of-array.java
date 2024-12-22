class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s=nums[0];
        int l=nums[nums.length-1];
        int gcd=0;
        for(int i=1;i<=l;i++){
            if(s%i==0&&l%i==0){
                gcd=i;
            }
        }
        return gcd;
        
    }
}