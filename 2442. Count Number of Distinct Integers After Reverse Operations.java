Ques Link - https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/submissions/

---------------------------------------- Solution --------------------------------------------------

class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for(int num : nums){
            s.add(num);
            if(num > 9){
                int rev = 0;
                while(num > 0){
                    rev = rev * 10 + num % 10;
                    num /= 10;
                }
                s.add(rev);
            }
        }
        return s.size();
    }
}
