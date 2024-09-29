class Solution {
    public int countDigits(int num) {
        int a=num;
        ArrayList<Integer> li=new ArrayList<>();
        int count=0;
        while(num>0){
            int r=num%10;
            li.add(r);
            num=num/10;
        }
        for(int i=0;i<li.size();i++){
            if(a%li.get(i)==0){
                count++;
            }
        }
        return count;
    }
}