Ques Link - https://leetcode.com/problems/find-the-child-who-has-the-ball-after-k-seconds

------------------------------------- Solution -------------------------------------------------

class Solution {
    public int numberOfChild(int n, int k) {
        n--;
        int rem = k % n;
        int div = k / n;
        
        if(div % 2 == 0)
            return rem;
        
        return n - rem;
    }
}
