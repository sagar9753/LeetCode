Ques Link - https://leetcode.com/problems/valid-mountain-array/

------------------------------------------ Solution ------------------------------

class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3)
            return false;
        int i = 1 ;
        int j = arr.length-2;

        while(i < arr.length && arr[i] > arr[i-1]){
            i++;
        }
        while(j >= 0 && arr[j] > arr[j+1]){
            j--;
        }
        return i-1 == j+1 && j+1 != arr.length-1 && i-1 != 0;
    }
}
