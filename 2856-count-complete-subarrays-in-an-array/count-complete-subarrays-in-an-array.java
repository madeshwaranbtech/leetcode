class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> li=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           li.add(nums[i]);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> l=new HashSet<>();
            for(int j=i;j<nums.length;j++){
               l.add(nums[j]);
                if(li.size()==l.size()){
                    ans++;
            }
            }

        }
        return ans;
    }
}