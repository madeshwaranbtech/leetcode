class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(hm.containsKey(grid[i][j])){
                    hm.put(grid[i][j],hm.get(grid[i][j])+1);
                }
                else{
                    hm.put(grid[i][j],1);
                }
            }
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            int v=entry.getValue();
            if(v>=2){
                ans[0]=entry.getKey();
            }
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                li.add(grid[i][j]);
            }
        }
        Collections.sort(li);
        int n = grid.length * grid.length;
        for (int i = 1; i <= n; i++) {
            if (!hm.containsKey(i)) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}