class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s=Integer.toString(nums[i]);
            for(int j=0;j<s.length();j++){
                int c=Character.getNumericValue(s.charAt(j));
                li.add(c);
            }
        }
        int[] arr=new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}