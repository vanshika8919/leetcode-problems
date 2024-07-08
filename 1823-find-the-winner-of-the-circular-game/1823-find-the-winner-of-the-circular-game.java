class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> ans = new ArrayList<>();

        for(int i=1; i<=n; i++)
        {
            ans.add(i);
        }
        int start = 0;

        while(ans.size()>1)
        {
            int remove = (start+k-1)%ans.size();
            ans.remove(remove);

            start = remove;
        }
        return ans.getFirst();
    }
}