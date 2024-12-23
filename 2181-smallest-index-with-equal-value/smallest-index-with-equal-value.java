class Solution {
    public int smallestEqual(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                li.add(i);
            }
        }
        if(li.size()==0){
            return -1;
        }
        else{
            return li.get(0);
        }
    }
}