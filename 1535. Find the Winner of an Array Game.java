Ques link - https://leetcode.com/problems/find-the-winner-of-an-array-game

----------------------------------------------------- Solution -------------------------------------------------------------

class Solution {
    public int getWinner(int[] arr, int k) {
        if(k == 1)
            return Math.max(arr[0],arr[1]);
        int i = 0;
        int count = 1;
        int prev = -1;
        int cur = 0;
        for(int j = 1 ; j < arr.length && count < k ; j++){
            if(prev == cur)
                count++;
            else
                count = 1;
            if(arr[i] > arr[j]){
                prev = cur;
                cur = arr[i];
            }
            else{
                prev = cur;
                cur = arr[j];
                i = j;
            }
        }
        if(count == k)
            return prev;
        return cur;
    }
}
