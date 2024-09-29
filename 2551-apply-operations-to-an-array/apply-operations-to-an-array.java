class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                li.add(nums[i]);
            }
            if(nums[i]==0){
                l.add(nums[i]);
            }
        }
        int[] ans=new int[nums.length];
        int q=0;
        for(int i=0;i<li.size();i++){
            ans[q++]=li.get(i);
        }
        for(int i=q;i<l.size();i++){
            ans[q++]=l.get(i);
        }
        return ans;
    }
}