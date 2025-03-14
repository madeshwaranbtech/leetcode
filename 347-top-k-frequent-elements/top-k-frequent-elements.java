class Solution {
    public int[] topKFrequent(int[] a, int k) {
        int n=a.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:a){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> li=new ArrayList<>(hm.keySet());
        Collections.sort(li, (a1, b) -> hm.get(b) -hm.get(a1));
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=li.get(i);
        }
        return ans;
    }
}