class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int a=(int)(0.05*n);
        double s=0;
        for(int i=a;i<n-a;i++){
            s+=arr[i];
        }
        double avg=s/(n-(a*2));
        return avg;
    }
}