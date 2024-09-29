class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(a>9){
                int sum=0;
                while(a>0){
                    int r=a%10;
                    sum=(sum*10)+r;
                    a=a/10;
                }
                hs.add(sum);
            }
            hs.add(nums[i]);
        }
        return hs.size();
    }
}