class Solution {
    public String greatestLetter(String s) {
        ArrayList<Character> up=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' &&s.charAt(i)<='Z'){
                up.add(s.charAt(i));
            }
        }
        ArrayList<Character> ans=new ArrayList<>();
        for(int i=0;i<up.size();i++){
            char x=up.get(i);
            for(int j=0;j<s.length();j++){
                char w= Character.toLowerCase(x);;
                if(w==s.charAt(j)){
                    ans.add(x);
                }
            }
        }
        String d="";
        Collections.sort(ans,Collections.reverseOrder());
        if(ans.size()==0){
            return "";
        }
        else{
            d+=ans.get(0);
            return d;
        }
    }
}