class Solution {
    public String largestGoodInteger(String nums) {
        int n=nums.length();
        ArrayList<Integer> li=new ArrayList<>();
        String a="";
        for(int i=0;i<n-2;i++){
            if(nums.charAt(i)==nums.charAt(i+1)&&nums.charAt(i+1)==nums.charAt(i+2)){
                a=a+nums.charAt(i)+nums.charAt(i+1)+nums.charAt(i+2);
                int q=Integer.parseInt(a);
                li.add(q);
                a="";
            }
        }
        Collections.sort(li);
        if(li.size()>=1){
        int y=li.get(li.size()-1);
        String h=Integer.toString(y);
        String u="00";
        if(h.equals("0")){
            u=u+h;
            return u;
        }
        return h;
        }
        return a;
    }
}