class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        ArrayList<String> li=new ArrayList<>();
        for(int i=0;i<str.length;i++){
            String q=fun(str[i]);
            li.add(q);
        }
        String ans="";
        for(int i=0;i<li.size()-1;i++){
            ans=ans+li.get(i)+" ";
        }
        ans=ans+li.get(li.size()-1);
        return ans;
    }
    public String fun(String a){
        String b="";
        for(int j=a.length()-1;j>=0;j--){
            b=b+a.charAt(j);
        }
        return b;
    }
}