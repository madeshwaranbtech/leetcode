class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n=garbage.length;
        int m=travel.length;
        int tg=0,tp=0,tm=0;
        int gh=0,ph=0,mh=0;
        for(int i=0;i<n;i++){
            String current=garbage[i];
            for(char mad:current.toCharArray()){
            if(mad=='G'){
                tg++;
                gh=i;
            }
            if(mad=='P'){
                tp++;
                ph=i;
            }
            if(mad=='M'){
                tm++;
                mh=i;
            }
            }
        }
        int travelg=0,travelp=0,travelm=0;
        for(int i=0;i<travel.length;i++){
            if(i<gh){
                travelg+=travel[i];
            }
            if(i<ph){
                travelp+=travel[i];
            }
             if(i<mh){
                travelm+=travel[i];
            }

        }
        int total=tg+tp+tm+travelg+travelp+travelm;
        return total;
    }
}