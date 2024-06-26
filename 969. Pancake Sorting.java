Ques Link - https://leetcode.com/problems/pancake-sorting/

----------------------------------- Solution --------------------------------------

class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();

        for(int i = arr.length ; i > 0 ; i--){
            int ind = find(arr, i);

            flipSubarray(arr, 0, ind);
            ans.add(ind+1);
            flipSubarray(arr,0,i-1);
            ans.add(i);
        }
        return ans;
    }
    public int find(int[] arr, int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
    public void flipSubarray(int[] arr, int l, int r){
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;r--;
        }
    }
}
