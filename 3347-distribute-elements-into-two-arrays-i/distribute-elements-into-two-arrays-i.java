class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> mad=new ArrayList<>();
        ArrayList<Integer> deep=new ArrayList<>();
        mad.add(nums[0]);
        deep.add(nums[1]);
        for(int i=2;i<n;i++){
            if(mad.get(mad.size()-1)>deep.get(deep.size()-1)){
                mad.add(nums[i]);
            }
            else{
                deep.add(nums[i]);
            }
        }
        int[] res=new int[n];
        int q=0;
        for(int i=0;i<mad.size();i++){
            res[q++]=mad.get(i);
        }
         for(int i=0;i<deep.size();i++){
            res[q++]=deep.get(i);
        }
        return res;
    }
}