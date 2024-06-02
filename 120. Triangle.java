Ques Link - https://leetcode.com/problems/triangle/

----------------------------------- Solution -------------------------------------

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        for(int i = triangle.size()-2 ; i >= 0 ; i--){
            for(int j = 0 ; j <= i ; j++){
                int left = triangle.get(i).get(j) + triangle.get(i+1).get(j);
                int right = triangle.get(i).get(j) + triangle.get(i+1).get(j+1);

                triangle.get(i).set(j, Math.min(left, right));
            }
        }
        return triangle.get(0).get(0);
    }
}
