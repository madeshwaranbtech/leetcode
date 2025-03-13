class Solution {
    public String thousandSeparator(int n) {
        if(n<1000){
            return Integer.toString(n);
        }
        String a=Integer.toString(n);
        StringBuilder sb=new StringBuilder();
        int count=0;
        int l=a.length();
        for(int i=l-1;i>=0;i--){
            if(count>0&&count%3==0){
                sb.append(".");
            }
            sb.append(a.charAt(i));
            count++;
        }
        return sb.reverse().toString();
    }
}