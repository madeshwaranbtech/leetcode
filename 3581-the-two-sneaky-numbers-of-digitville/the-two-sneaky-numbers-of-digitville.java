class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int mad:nums){
            if(hm.containsKey(mad)){
                hm.put(mad,hm.get(mad)+1);
            }
            else{
                hm.put(mad,1);
            }
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            int val=entry.getValue();
            if(val==2){
                li.add(entry.getKey());
            }
        }
        int[] arr=new int[li.size()];
        arr[0]=li.get(0);
        arr[1]=li.get(1);
        return arr;
    }
}