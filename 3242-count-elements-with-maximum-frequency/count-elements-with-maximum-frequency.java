class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int deep:nums){
            if(hm.containsKey(deep)){
                hm.put(deep,hm.get(deep)+1);
            }
            else{
                hm.put(deep,1);
            }
        }
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int max=0;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            int x=entry.getValue();
            li.add(x);
        }
        Collections.sort(li);
        for(int i=li.size()-1;i>=0;i--){
            ans.add(li.get(i));
        }
        int mad=ans.get(0);
        max=ans.get(0);
        for(int i=1;i<ans.size();i++){
            if(ans.get(i)==mad){
                max=max+ans.get(i);
            }
        }
        return max;
        
    }
}