class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<ranges.length;i++){
            for(int j = ranges[i][0]; j <= ranges[i][1]; j++){
                li.add(j);
            }
        }
        boolean t=func(li,left,right);
        return t;
    }
    public boolean func(ArrayList<Integer> li,int a,int b){
       for(int i=a;i<=b;i++){
        if(!li.contains(i)){
            return false;
        }
       }
       return true;
    }
}