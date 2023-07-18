Ques Link - https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description/

-------------------------------------------- Solution ----------------------------------------------------

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] count = new int[A.length + 1];
        int[] ans = new int[A.length];
        int c = 0;

        for(int i = 0 ; i < A.length ; i++){
            if(++count[A[i]] == 2)
                c++;

            if(++count[B[i]] == 2)
                c++;
            ans[i] = c;
        }
        return ans;
    }
}
