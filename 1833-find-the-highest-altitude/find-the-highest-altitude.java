class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] mad=new int[n+1];
        mad[0]=0;
        mad[1]=gain[0];
        int k=2;
        for(int i=1;i<n;i++){
            int result=mad[i]+gain[i];
            mad[k++]=result;
        }
        int max=mad[0];
        for(int i=0;i<k;i++){
            if(max<mad[i]){
                max=mad[i];
            }
        }
        return max;
    }
}