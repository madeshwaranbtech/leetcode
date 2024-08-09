class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int deep:nums){
            if(hm.containsKey(deep)){
                hm.put(deep,hm.get(deep)+1);
            }
            else{
                hm.put(deep,1);
            }
        }
        int mad=0;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>n/3){
                li.add(entry.getKey());
            }
        }
        return li;


        
    }
}