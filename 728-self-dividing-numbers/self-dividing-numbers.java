class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=left;i<=right;i++){
            li.add(i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<li.size();i++){
            int num=li.get(i);
            int num1=num;
            int c=0;
            int c1=0;
            if(num1%10!=0){
            while(num>0){
                c++;
                int rem=num%10;
                if(rem!=0){
                if(num1%rem==0){
                    c1++;
                }
                }
                num=num/10;
            }
            if(c==c1){
                ans.add(num1);
            }
            }
        }
        return ans;
    }
}