Ques link - https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/

------------------------------------------------------ Solution --------------------------------------------------

class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int take;
        for(int i = arr.length-1 ; i >= 0 ; i--){
            take = arr[i];
            arr[i] = max;
            max = Math.max(max,take);
        }
        return arr;
    }
}
