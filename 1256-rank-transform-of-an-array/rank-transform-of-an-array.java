class Solution {
    public int[] arrayRankTransform(int[] arr) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
                li.add(arr[i]);
        }
        Collections.sort(li);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=1;
        for(int num:li){
            if(!hm.containsKey(num))
            hm.put(num,c++);
        }
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=hm.get(arr[i]);
        }
        return ans;
    }
}