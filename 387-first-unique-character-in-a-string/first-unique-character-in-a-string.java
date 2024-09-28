class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        ArrayList<Character> li=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            int k=entry.getValue();
            char c=entry.getKey();
            if(k==1){
                li.add(c);
            }
        }
        int key=s.length()+1;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<li.size();j++){
                if(s.charAt(i)==li.get(j)){
                    key=i;
                    break;
                }
            }
                if(key!=s.length()+1){
                    break;
                }
        }
        if(key!=s.length()+1){
        return key;
        }
        else{
            return -1;
        }
    }
}