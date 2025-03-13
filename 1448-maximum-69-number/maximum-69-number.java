class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer>li=new ArrayList<>();
        String s=Integer.toString(num);
        int n=s.length();
        int c=0;
        while(n>0){
            StringBuilder sb=new StringBuilder(s);
            if(sb.charAt(c)=='6'){
                sb.setCharAt(c,'9');
            }
            c++;
            n--;
            String q=sb.toString();
            int w=Integer.parseInt(q);
            li.add(w);
        }
        Collections.sort(li,Collections.reverseOrder());
        return li.get(0);
    }
}