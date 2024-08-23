class Solution {
    public char repeatedCharacter(String s) {
        ArrayList<Character> li=new ArrayList<>();
        char c='a';
        for(int i=0;i<s.length();i++){
            if(li.contains(s.charAt(i))){
                c=s.charAt(i);
                break;
            }
            else{
                li.add(s.charAt(i));
            }
        }
        return c;
    }
}