class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String ans="";
        String[] a=sentence.split(" ");
        for(String word:a){
            String replacement=word;
            for(String root:dictionary){
                if(word.startsWith(root)){
                    if(root.length()<replacement.length()){
                        replacement=root;
                    }
                }
            }
            ans+=replacement+" ";
        }
        return ans.trim();
    }
}