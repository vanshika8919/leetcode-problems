class Solution {
    public int hammingDistance(int x, int y) {
        int hamdis = 0;
        int xor = x ^ y;
        
        while(xor!=0)
        {
            hamdis += xor&1;
            xor = xor >> 1;
        }
        return hamdis;
    }
}