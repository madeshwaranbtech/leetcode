class Solution {
    public int findLHS(int[] nums) {
        int mad=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int deep:nums){
            if(hm.containsKey(deep)){
                hm.put(deep,hm.get(deep)+1);
            }
            else{
                hm.put(deep,1);
            }
        }
        for(int ap:hm.keySet()){
            if(hm.containsKey(ap+1)){
                mad=Math.max(mad,hm.get(ap)+hm.get(ap+1));
            }
        }
        return mad;
    }
}