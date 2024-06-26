class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> li = new ArrayList<Integer>();
        
        backtrack(candidates, target, 0, li, al);
        
        return al;
    }
    
    public void backtrack(int[] candidates, int target, int idx, List<Integer> li, List<List<Integer>> al)
    {
        if(target == 0)
        {
            al.add(new ArrayList<>(li));
            return;
        }
        
        if(idx >= candidates.length ||  target < 0)
        {
            return;
        }
        
        for(int i=idx; i<candidates.length; i++)
        {
            if(target>=candidates[i])
            {
                li.add(candidates[i]);
                backtrack(candidates, target-candidates[i], i, li, al);
                li.remove(li.size()-1);
            }
        }
    }
}