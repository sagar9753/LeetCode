Ques Link - https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one

----------------------------------------------- Solution ---------------------------------------------

class Solution {
    public int numSteps(String s) {
        int ans = 0, carry = 0;
        int i = s.length()-1;

        while(i > 0){
            int num = s.charAt(i) - '0';
            if((num + carry) == 0)
                ans++;
            else if((num + carry) == 1){
                ans += 2;
                carry = 1;
            }
            else{
                ans += 1;
                carry = 1;
            }
            i--;
        }
        if(carry == 1)
            ans++;
        return ans;
    }
}
