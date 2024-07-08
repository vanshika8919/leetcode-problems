class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        StringBuilder e = new StringBuilder(s);
        
        for(int i=0; i<n; i++)
        {
            e.setCharAt(i,s.charAt((i+k)%n));
        }
        String ans = e.toString();
        return ans;
    }
}