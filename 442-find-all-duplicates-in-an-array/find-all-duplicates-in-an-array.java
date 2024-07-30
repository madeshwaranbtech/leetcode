class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int deep:hm.keySet()){
            if(hm.get(deep)>1){
                li.add(deep);
        }
        }
        return li;
    }
}