Ques Link - https://leetcode.com/problems/gas-station

------------------------------------------------- Solution --------------------------------------------------------------

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cur = 0;
        int sum = 0;
        int total = 0;

        for(int i = 0 ; i < cost.length ; i++){
            total += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if(sum < 0){
                cur = i + 1;
                sum = 0;
            }
        }
        return total >= 0 ? cur : -1;
    }
}
