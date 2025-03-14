class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        ArrayList<Character>li =new ArrayList<>(hm.keySet());
        Collections.sort(li,(a,b)->hm.get(b)-hm.get(a));
        StringBuilder sb=new StringBuilder();
        for(char d:li){
            int r=hm.get(d);
            for(int i=0;i<r;i++){
                sb.append(d);
            }
        }
        return sb.toString();
    }
}