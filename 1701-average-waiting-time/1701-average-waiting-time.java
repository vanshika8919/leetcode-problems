class Solution {
    public double averageWaitingTime(int[][] customers) {
        double avg = 0;
        double tot_sum = customers[0][0];
        double val = 0;

        for(int i=0; i<customers.length; i++)
        {
            if(customers[i][0]<=tot_sum)
            {
                tot_sum = tot_sum + customers[i][1];
                val = val + tot_sum - customers[i][0];
            }
            else
            {
                tot_sum = customers[i][0];
                tot_sum = tot_sum + customers[i][1];
                val = val + customers[i][1];
            }
            avg = val/customers.length;
        }
        return avg;
    }
}