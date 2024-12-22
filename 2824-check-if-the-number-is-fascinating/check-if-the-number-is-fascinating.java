class Solution {
    public boolean isFascinating(int n) {
        int a=n*2;
        int b=n*3;
        String a1=Integer.toString(n);
        String b1=Integer.toString(a);
        String c1=Integer.toString(b);
        String d=a1+b1+c1;
        HashSet<Character> hs=new HashSet<>();
        if (d.length() == 9 && !d.contains("0")) {
        for(int i=0;i<d.length();i++){
            hs.add(d.charAt(i));
        }
        }
        if(hs.size()==9){
            return true;
        }
        else{
            return false;
        }
    }
}