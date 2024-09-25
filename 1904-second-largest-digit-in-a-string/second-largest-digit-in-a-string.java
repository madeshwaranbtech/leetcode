class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'){
                int c=Character.getNumericValue(s.charAt(i));
                set.add(c);
            }
        }
        ArrayList<Integer> li=new ArrayList<>(set);
        Collections.sort(li);
        if(li.size()>1){
        return li.get(li.size()-2);
        }
        else{
            return -1;
        }
    }
}