class Solution {
    public boolean isSameAfterReversals(int num) {
        String h=Integer.toString(num);
        if(h.length()==1){
            return true;
        }
        if(h.charAt(h.length()-1)=='0'){
            return false;
        }
        String m="";
        int deep=num;
        while(num>0){
            int rem=num%10;
            String n=Integer.toString(rem);
            m=m+n;
            num=num/10;
        }
        String a="";
        for(int i=m.length()-1;i>=0;i--){
            a=a+m.charAt(i);
        }
        int u=Integer.parseInt(a);
        if(u==deep){
            return true;
        }
        else{
            return false;
        }
        
    }
}