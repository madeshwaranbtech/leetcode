class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int deep:nums){
            if(hm.containsKey(deep)){
                hm.put(deep,hm.get(deep)+1);
            }
            else{
                hm.put(deep,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>1){
                ans=entry.getKey();
            }
        }
        return ans;
    }
}
