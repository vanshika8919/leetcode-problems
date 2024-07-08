class Solution {
    public int countDigits(int num) {
        int count=0;
        int no=num;
        while(num>0)
        {
            int n = num%10;
            if(no%n==0)
            {
                count++;
            }
            num = num/10;
        }
        return count;
    }
}