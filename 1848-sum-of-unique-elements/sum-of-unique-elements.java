class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int deep:nums){
            if(hm.containsKey(deep)){
                hm.put(deep,hm.get(deep)+1);
            }
            else{
                hm.put(deep,1);
            }
        }
        int max=0;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==1){
                max=max+entry.getKey();
            }
        }
        return max;
    }
}