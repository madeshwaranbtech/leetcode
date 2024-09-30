class Solution {
    public int numberOfSpecialChars(String word) {
        ArrayList<Character> li=new ArrayList<>();
        ArrayList<Character> l=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
            if(! li.contains(word.charAt(i))){
                li.add(word.charAt(i));
            }
        }
        }
       for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
            if(! l.contains(word.charAt(i))){
                l.add(word.charAt(i));
            }
        }
        }
        int count=0;
        for(int i=0;i<li.size();i++){
            for(int j=0;j<l.size();j++){
                if(Character.toUpperCase(li.get(i))==l.get(j)){
                    count++;
                }
            }
        }
        return count;
    }
}