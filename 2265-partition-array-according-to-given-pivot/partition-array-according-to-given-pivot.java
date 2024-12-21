class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> m=new ArrayList<>();
        ArrayList<Integer> r=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                l.add(nums[i]);
            }
            if(nums[i]==pivot){
                m.add(nums[i]);
            }
            if(nums[i]>pivot){
                r.add(nums[i]);
            }
        }
        int[] ans=new int[l.size()+r.size()+m.size()];
        int k=0;
        for(int i=0;i<l.size();i++){
            ans[k++]=l.get(i);
        }
        for(int i=0;i<m.size();i++){
            ans[k++]=m.get(i);
        }
        for(int i=0;i<r.size();i++){
            ans[k++]=r.get(i);
        }
        return ans;
    }
}