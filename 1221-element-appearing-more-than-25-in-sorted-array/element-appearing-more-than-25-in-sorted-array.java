class Solution {
    public int findSpecialInteger(int[] arr) {
        int d=(arr.length*25)/100;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int mad:arr){
            if(hm.containsKey(mad)){
                hm.put(mad,hm.get(mad)+1);
            }
            else{
                hm.put(mad,1);
            }
        }
        int kp=0;
        for(int deep:hm.keySet()){
            if(hm.get(deep)>d){
                kp=deep;
            }
        }
        return kp;
    }
}