class Solution {
    public String capitalizeTitle(String title) {
        String[] ans=title.split(" ");
        String mad="";
        for(int i=0;i<ans.length;i++){
            String s=ans[i];
            if(s.length()<=2){
                String m=s.toLowerCase();
                mad=mad+m+" ";
            }
            if(s.length()>=3){
                char c=Character.toUpperCase(s.charAt(0));
                String n="";
                n=n+c;
                for(int j=1;j<s.length();j++){
                    char d=Character.toLowerCase(s.charAt(j));
                    n=n+d;
                }
                mad=mad+n+" ";
            }
        }
        return mad.trim();
    }
}