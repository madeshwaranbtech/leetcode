class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        if(n==2){
            return nums[0]==nums[1]?true:false;
        }
        int[] a=new int[501];
        for(int i=0;i<n;i++){
            a[nums[i]]++;
        }
        for(int i=1;i<501;i++){
            if(a[i]%2!=0){
                return false;
            }
        }
        return true;
    }
}