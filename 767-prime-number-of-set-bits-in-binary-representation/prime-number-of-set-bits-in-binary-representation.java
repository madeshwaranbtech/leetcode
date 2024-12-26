class Solution {
    public int countPrimeSetBits(int left, int right) {
        ArrayList<Integer> hs=new ArrayList<>();
        for(int j=left;j<=right;j++){
            String s=Integer.toBinaryString(j);
            int c=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    c++;
                }
            }
            if(isprime(c)){
                hs.add(c);
            }
        }
        return hs.size();
    }
    public boolean isprime(int a){
        if(a<2){
            return false;
        }
        if(a==2 || a==3){
            return true;
        }
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}