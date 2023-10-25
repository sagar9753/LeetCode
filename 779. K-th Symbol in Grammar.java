Ques Link - https://leetcode.com/problems/k-th-symbol-in-grammar/description/

----------------------------------------------- Solution --------------------------------------------------

class Solution {
    public int kthGrammar(int n, int k) {
        int len = (int)Math.pow(2,n-1);
        if(n == 1)
            return 0;
        if(k <= len/2)
            return kthGrammar(n-1,k);
        return kthGrammar(n-1,k-len/2) == 0 ? 1 : 0;
    }
}
