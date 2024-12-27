class Solution {
    public int getLucky(String s, int k) {
        StringBuilder numericString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            numericString.append(s.charAt(i) - 'a' + 1);
        }
        int sum = 0;
        for (int i = 0; i < numericString.length(); i++) {
            sum += numericString.charAt(i) - '0';
        }
        while (k > 1) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
            k--;
        }
        return sum;
    }
}
