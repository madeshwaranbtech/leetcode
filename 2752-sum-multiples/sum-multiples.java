class Solution {
    public int sumOfMultiples(int n) {
        int[] mad=new int[n];
        int k=0;
        for(int i=1;i<=n;i++){
            if(i%3==0||i%5==0||i%7==0){
                mad[k++]=i;
            }
        }
        int sum=0;
        for(int i=0;i<mad.length;i++){
            sum=sum+mad[i];
        }
        return sum;
    }
}