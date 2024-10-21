class Solution {
    public int maxUniqueSplit(String s) {
        return solve(0,s,new HashSet<>());
    }
    public int solve(int l,String s,Set<String> hs){
        if(l==s.length()){
            return 0;
        }
        int max=0;
        for(int i=l+1;i<=s.length();i++){
            String sub=s.substring(l,i);
            if(!hs.contains(sub)){
                hs.add(sub);
                int split=1+solve(i,s,hs);
                max=Math.max(max,split);
                hs.remove(sub);
            }
        }
        return max;
    }
}