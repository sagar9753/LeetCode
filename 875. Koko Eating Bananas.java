Ques Link - https://leetcode.com/problems/koko-eating-bananas/

-------------------------------------- Solution ----------------------------------------------

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1 ; 
        int r = findMax(piles);
        int mid;
        while(l <= r){
            mid = (l+r)/2;
            int count = calHour(piles,mid);
            if(count <= h)
                r = mid-1;
            else
                l = mid+1;
        }
        return l;
    }
    public int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++)
            max = Math.max(max,arr[i]);
        return max;
    }
    public int calHour(int[] arr,int bananas){
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            ans += Math.ceil((double)(arr[i]) / (double)(bananas));
        }
        return ans;
    }
}
