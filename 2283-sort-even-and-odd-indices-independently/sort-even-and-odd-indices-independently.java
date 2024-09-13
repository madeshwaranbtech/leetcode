class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int[] ans=new int[nums.length];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=even.get(j);
                j++;
            }
            else{
                ans[i]=odd.get(k);
                k++;
            }
        }
        return ans;
    }
}