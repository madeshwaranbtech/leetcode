class Solution {
    public int mostFrequentEven(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                li.add(nums[i]);
            }
        }
        if(li.isEmpty()){
            return -1;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<li.size();i++){
            if(!hm.containsKey(li.get(i))){
                hm.put(li.get(i),1);
            }
            else{
                hm.put(li.get(i),hm.get(li.get(i))+1);
            }
        }
        int p=0;
        int res=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            int k=entry.getKey();
            int v=entry.getValue();
            if(v>p||(v==p&&k<res)){
                p=v;
                res=k;
            }
        }
        return res;
    }
}