-------------------------------------------------- String (Easy) -------------------------------------
  
Ques Link - https://leetcode.com/problems/fizz-buzz/description/

-------------------------------------------------- Solution ------------------------------------------
  
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans =new ArrayList<>();

        for(int i=1;i<=n;i++){
            StringBuilder sb = new StringBuilder();
            if(i % 3==0)
                sb.append("Fizz");
            if(i % 5 == 0)
                sb.append("Buzz");
            
            if(sb.length()==0)
                ans.add(String.valueOf(i));
            else
                ans.add(sb.toString());
        }
        return ans;
    }
    
}
