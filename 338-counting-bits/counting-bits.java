class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            String m=Integer.toBinaryString(i);
            int m1=madesh(m);
            arr[i]=m1;
        }
        return arr;
        
    }
    public int madesh(String m){
        int count=0;
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}