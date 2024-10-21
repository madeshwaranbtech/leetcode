class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<score.length;i++){
            li.add(score[i]);
        }
        Collections.sort(li,Collections.reverseOrder());
        HashMap<Integer,String> hm=new HashMap<>();
        for(int i=0;i<score.length;i++){
                if(i==0){
                    hm.put(li.get(i),"Gold Medal");
                }
                if(i==1){
                    hm.put(li.get(i),"Silver Medal");
                }
                if(i==2){
                    hm.put(li.get(i),"Bronze Medal");
                }
               if(i>2){
                    hm.put(li.get(i),Integer.toString(i+1));
                }
            }
        String[] res=new String[score.length];
        for(int i=0;i<score.length;i++){
            res[i]=hm.get(score[i]);
        }
        return res;
    }
}