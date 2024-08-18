class Solution {
    public int findNumbers(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        int i=0;
        int count=0;
        int madesh=0;
        while(i<nums.length){
            int n=nums[i];
            count=0;
            while(n>0){
                int res=n%10;
                count++;
                n=n/10;
            }
            if(count%2==0){
                madesh++;
            }
            i++;
        }
        return madesh;
    }
}