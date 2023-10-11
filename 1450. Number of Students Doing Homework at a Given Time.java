Ques Link - https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/

---------------------------------- Solution ------------------------------------

class Solution {
    public int busyStudent(int[] st, int[] et, int qt) {
        int ans = 0;
        for(int i = 0 ; i < st.length ; i++)
            if(st[i] <= qt && et[i] >= qt)
                ans++;

        return ans;
    }
}
