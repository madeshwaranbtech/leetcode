class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        ArrayList<Integer> o=new ArrayList<>();
        ArrayList<Integer> e=new ArrayList<>();
        for(int a:hm.values()){
            if(a%2!=0){
                o.add(a);
            }
            if(a%2==0){
                e.add(a);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<o.size();i++){
            for(int j=0;j<e.size();j++){
                int q=o.get(i)-e.get(j);
                ans.add(q);
            }
        }
        Collections.sort(ans,Collections.reverseOrder());
        return ans.get(0);
    }
}