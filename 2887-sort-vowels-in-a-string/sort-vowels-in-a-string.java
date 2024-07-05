class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        char[] mad=new char[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                mad[k++]=s.charAt(i);
            }
        }
        char[] vowels = Arrays.copyOf(mad, k);
        Arrays.sort(vowels);
        StringBuilder madesh=new StringBuilder(s);
        k=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                madesh.setCharAt(i, vowels[k++]);
        }
        }
        return madesh.toString();

    }
}