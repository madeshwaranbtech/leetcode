class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] m=s.split(" ");
        if(pattern.length()!=m.length){
            return false;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<String,Integer> hm1=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String deep=m[i];
            Integer madesh=hm.put(c,i);
            Integer dharnesh=hm1.put(deep,i);
            if(!Objects.equals(madesh,dharnesh)){
                return false;
            }
        }
        return true;
    }
}