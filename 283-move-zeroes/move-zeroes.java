class Solution {
    public void moveZeroes(int[] nums) {
		int z=0,nz=0;
        while(nz<nums.length){
            if(nums[nz]!=0){
                swap(nums,z,nz);
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }

    }
    public static void swap(int[] nums,int start,int  end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}