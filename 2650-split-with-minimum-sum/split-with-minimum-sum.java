class Solution {
    public int splitNum(int num) {
        String s=num+"";
        char[] a=s.toCharArray();
        Arrays.sort(a);
        String b="";
        String c="";
        for(int i=0;i<a.length;i=i+2){
            b=b+a[i];
        }
        for(int i=1;i<a.length;i=i+2){
            c=c+a[i];
        }
        int d=Integer.parseInt(b)+Integer.parseInt(c);
        return d;
    }
}