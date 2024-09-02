class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hm=new HashMap<>();
        HashMap<String,Integer> hm1=new HashMap<>();
        for(String mad:words1){
            if(hm.containsKey(mad)){
                hm.put(mad,hm.get(mad)+1);
            }
            else{
                hm.put(mad,1);
            }
        }
        for(String mad:words2){
            if(hm1.containsKey(mad)){
                hm1.put(mad,hm1.get(mad)+1);
            }
            else{
                hm1.put(mad,1);
            }
        }
        int count=0;
        for(String s:hm.keySet()){
            if(hm1.containsKey(s)&&hm.get(s)==1&&hm1.get(s)==1){
                count++;
            }
        }
        return count;
    }
}