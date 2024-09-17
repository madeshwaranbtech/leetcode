class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s11=s1.split(" ");
        String[] s22=s2.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();
        ArrayList<String> li=new ArrayList<>();
        for(String deep:s11){
            if(hm.containsKey(deep)){
                hm.put(deep,hm.get(deep)+1);
            }
            else{
                hm.put(deep,1);
            }
        }
         for(String deep:s22){
            if(hm.containsKey(deep)){
                hm.put(deep,hm.get(deep)+1);
            }
            else{
                hm.put(deep,1);
            }
        }
        for(Map.Entry<String,Integer> entry:hm.entrySet()){
            int value=entry.getValue();
            if(value==1){
                li.add(entry.getKey());
            }
        }
        String[] s=new String[li.size()];
        for(int i=0;i<li.size();i++){
            s[i]=li.get(i);
        }
        return s;
    }
}