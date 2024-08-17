class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> li=new HashMap<>();
        for(int deep:nums){
            if(li.containsKey(deep)){
                li.put(deep,li.get(deep)+1);
            }
            else{
                li.put(deep,1);
            }
        }
        int key=0;
        for(Map.Entry<Integer,Integer> entry:li.entrySet()){
            if(entry.getValue()>1){
                key=entry.getKey();
            }
        }
        return key;
    }
}