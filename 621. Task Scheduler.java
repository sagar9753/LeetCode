Ques Link - https://leetcode.com/problems/task-scheduler

--------------------------------- Solution ----------------------------------

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];

        for(char c : tasks)
            count[c-'A']++;
        Arrays.sort(count);
        int max = count[25];
        int idelTime = (max - 1) * n;

        for(int i = 24 ; i >= 0 ; i--)
            idelTime -= Math.min(max-1,count[i]);
            
        return tasks.length + Math.max(0,idelTime);
    }
}
