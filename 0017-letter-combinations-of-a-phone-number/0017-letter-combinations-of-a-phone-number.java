class Solution {
    public static void solve(List<String> result, String digits, HashMap<Character,String> Dial,String ans, int i)
    {
        if(i==digits.length())
        {
            result.add(ans);
            return;
        }
        else
        {
            char ch = digits.charAt(i);
            String str = Dial.get(ch);
            for(int j=0; j<str.length(); j++)
            {
                solve(result, digits, Dial, ans+str.charAt(j),i+1);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String ans = "";
        if(digits.length()==0)
        {
            return result;
        }
        HashMap<Character,String> Dial = new HashMap<>();
        Dial.put('2',"abc");
        Dial.put('3',"def");
        Dial.put('4',"ghi");
        Dial.put('5',"jkl");
        Dial.put('6',"mno");
        Dial.put('7',"pqrs");
        Dial.put('8',"tvu");
        Dial.put('9',"wxyz");
        
        solve(result,digits,Dial,ans,0);
        return result;
    }

}