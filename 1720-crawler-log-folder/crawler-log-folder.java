class Solution {
    public int minOperations(String[] logs) {
        int n=logs.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(!logs[i].equals("../")&&!logs[i].equals("./")){
                
                    count++;
            
            }
            else if(logs[i].equals("../")){
                if(count!=0){
                    count--;
                }
            }
            else{
                continue;

            }
        }
         return count;
    }
}