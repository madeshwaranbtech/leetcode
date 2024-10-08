class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            li.add(arr[i]);
        }
        for(int i=1;i<=10000;i++){
            if(!li.contains(i)){
                l.add(i);
            }
        }
        return l.get(k-1);
        
    }
}