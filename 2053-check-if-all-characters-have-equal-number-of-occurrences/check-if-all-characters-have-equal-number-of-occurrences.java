class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            int k=entry.getValue();
            li.add(k);
        }
        int q=1;
        int m=li.get(0);
        for(int i=1;i<li.size();i++){
            if(m==li.get(i)){
                q++;
            }
        }
        if(q==li.size()){
            return true;
        }
        return false;
    }
}