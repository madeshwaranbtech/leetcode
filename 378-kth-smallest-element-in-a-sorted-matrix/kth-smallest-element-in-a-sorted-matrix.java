class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> li=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row*col;i++){
           int rows=i/col;
            int cols=i%col;
            li.add(matrix[rows][cols]);
        }
        Collections.sort(li);
        if(li.size()==1){
            return li.get(0);
        }
        return li.get(k-1);
    }
}