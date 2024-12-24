class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a=matrix.length;
        int b=matrix[0].length;
        int l=0;
        int r=a*b-1;
        int mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            int i=mid/b;
            int j=mid%b;
            if(matrix[i][j]==target){
                return true;
            }
            if(matrix[i][j]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
        return false;
    }
}