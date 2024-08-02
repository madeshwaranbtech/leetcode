class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int min=nums1[0];
        int min1=nums2[0];
        int[] arr=new int[n+m];
        int u=0;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    arr[u++]=nums1[i];
                    count++;
                }
            }
        }
        if(count>0){
            int max=arr[0];
            for(int i=0;i<u;i++){
                if(max>arr[i]){
                    max=arr[i];
                }
            }
            return max;
        }
        else{
        for(int i=1;i<n;i++){
            if(min>nums1[i]){
                min=nums1[i];
            }
        }
         for(int i=1;i<m;i++){
            if(min1>nums2[i]){
                min1=nums2[i];
            }
        }
        int s=Math.min(min,min1);
        int d=Math.max(min,min1);
        String s1=Integer.toString(s);
        String d1=Integer.toString(d);
        String ans=s1+d1;
        int ans1=Integer.parseInt(ans);
        return ans1;
        }
    }
}