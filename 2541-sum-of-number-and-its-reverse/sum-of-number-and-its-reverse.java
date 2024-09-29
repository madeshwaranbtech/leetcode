class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        boolean t=false;
        for(int i=num/2;i<num;i++){
            int a=i;
            int b=a;
            int sum=0;
            while(b>0){
                int r=b%10;
                sum=(sum*10)+r;
                b=b/10;
            }
            if(a+sum==num){
                t=true;
                break;
            }
        }
        if(num==0){
            return true;
        }
        return t;
    }
}