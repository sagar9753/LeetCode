Ques Link - https://leetcode.com/problems/minimum-absolute-difference/submissions/

---------------------------------------- Solution --------------------------------------

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 1 ; i < arr.length ; i++){
            int dif = arr[i] - arr[i-1];
            if(dif < min){
                ans.clear();
                min = dif;
                ans.add(Arrays.asList(arr[i-1] , arr[i]));
                continue;
            }
            if(dif == min)
                ans.add(Arrays.asList(arr[i-1] , arr[i]));

        }
        return ans;
    }
}
