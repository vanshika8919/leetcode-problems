class Solution {
    public int minOperations(String[] logs) {
        int count = 0;

        for(int i=0; i<logs.length; i++)
        {
            if(logs[i].equals("../") && count>0)
            {
                count--;
                System.out.println(count);
            }
            else if(logs[i].equals("./"))
            {
                count = count;
                System.out.println(count);
            }
            else
            {
                count++;
                System.out.println(count);
            }
        }
        return count;
    }
}