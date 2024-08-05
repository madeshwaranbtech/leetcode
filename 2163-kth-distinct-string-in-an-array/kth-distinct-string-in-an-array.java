class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length;
        HashMap<String,Integer> hm=new HashMap<>();
        for(String deep:arr){
            hm.put(deep,hm.getOrDefault(deep,0)+1);
        }
        String mad="";
        int count=0;
        for(String deep:arr){
            if(hm.get(deep)==1){
                mad=deep;
                count++;
            }
            if(count==k){
                return mad;
            }
        }
        return "";

    }
}