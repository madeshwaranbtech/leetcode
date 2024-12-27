class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer,Integer> hm=new HashMap<>();
         Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        for (int num : nums3) {
            set3.add(num);
        }
        for (int num : set1) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int num : set2) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int num : set3) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> li=new ArrayList<>();
       for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
        int q=entry.getValue();
        if(q>=2){
            li.add(entry.getKey());
        }
       }
       return li;
    }
}