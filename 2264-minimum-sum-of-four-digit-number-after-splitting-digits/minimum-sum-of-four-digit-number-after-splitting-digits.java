class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> li=new ArrayList<>();
        while(num>0){
            int n=num%10;
            li.add(n);
            num=num/10;
        }
        Collections.sort(li);
        int f=0;
        int f1=0;
        for(int i=0;i<li.size();i++){
            if(i%2==0){
                f=f*10;
                f=f+li.get(i);
            }
            else{
                f1=f1*10;
                f1=f1+li.get(i);
            }
        }
        return f+f1;
    }
}