class Solution {
    public int[] findIndices(int[] nums, int id, int vd) {
        int[] a=new int[2];
        a[0]=-1;
        a[1]=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((Math.abs(i-j))>=id &&(Math.abs(nums[i]-nums[j]))>=vd){
                    a[0]=i;
                    a[1]=j;
                }
           }
        }
        return a;
    }
}