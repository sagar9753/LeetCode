Ques Link - https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

------------------------------------------ Solution -----------------------------------------------------

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < m*k) return -1;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0 ; i < bloomDay.length ; i++){
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        int mid, ans = -1;;
        while(min <= max){
            mid = (min + max) / 2;
            if(possible(bloomDay, m, k, mid)){
                max = mid-1;
                ans = mid;
            }
            else
                min = mid+1;
        }
        return ans;
    }
    public boolean possible(int[] arr, int m, int k, int day){
        int count = 0, noOfBouquets = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] <= day)
                count++;
            else{
                noOfBouquets += (count / k);
                count = 0;
            }
        }
        noOfBouquets += (count / k);
        return noOfBouquets >= m;
    }
}
