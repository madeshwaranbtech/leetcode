class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<String> li=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String f=String.valueOf(i);
            li.add(f);
        }
        Collections.sort(li);
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<li.size();i++){
            int y=Integer.parseInt(li.get(i));
            l.add(y);
        }
        return l;
    }
}