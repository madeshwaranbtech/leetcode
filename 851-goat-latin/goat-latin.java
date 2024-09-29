class Solution {
    public String toGoatLatin(String sentence) {
        ArrayList<String> li=new ArrayList<>();
        String[] str=sentence.split(" ");
        int a=2;
        for(int i=0;i<str.length;i++){
            String s=str[i];
            if(s.length()>1){
                char c=s.charAt(0);
                String m="";
                if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U'){
                s=s+c;
                for(int j=1;j<s.length();j++){
                    m=m+s.charAt(j);
                }
                }
                else{
                     for(int j=0;j<s.length();j++){
                        m=m+s.charAt(j);
                }
                }
                m=m+"m";
                for(int k=0;k<a;k++){
                    m=m+"a";
                }
                a++;
                li.add(m);
            }
            else{
                s=s+"m";
                for(int k=0;k<a;k++){
                    s=s+"a";
                }
                a++;
                li.add(s);

            }
        }
        String ans="";
        for(int i=0;i<li.size();i++){
            ans=ans+li.get(i)+" ";
        }
        return ans.trim();
    }
}