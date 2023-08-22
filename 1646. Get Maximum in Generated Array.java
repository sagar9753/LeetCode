Ques Link - https://leetcode.com/problems/get-maximum-in-generated-array/description/

------------------------------------ Solution --------------------------------------------

class Solution {
    public int getMaximumGenerated(int n) {
        if(n == 0)
            return n;
            
        int[] arr = new int[n+1];
        arr[1] = 1;
        int max = 1;

        for(int i = 1 ; i < (n+1)/2 ; i++){
            arr[i*2] = arr[i];
            arr[(i*2)+1] = arr[i] + arr[i+1];
            max = Math.max(max, arr[(i*2)+1]);
        }
        return max;
    }
}
