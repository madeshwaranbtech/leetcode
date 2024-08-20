class Solution {
    public int canBeTypedWords(String text, String bl) {
        int count=0;
        for(String s:text.split(" ")){
            ArrayList<Character> li=new ArrayList<>();
            int mad=0;
            for(char c:s.toCharArray()){
                li.add(c);
            }
            for(char m:bl.toCharArray()){
                if(li.contains(m)){
                    mad++;
                }
            }
            if(mad==0){
                count++;
            }
                

        }
        return count;
    }
}