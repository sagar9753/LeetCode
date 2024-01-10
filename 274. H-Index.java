Ques Link - https://leetcode.com/problems/h-index/

-------------------------------------------- Solution 1 ------------------------------------------------

class Solution {
    public int hIndex(int[] cit) {
        Arrays.sort(cit);

        for(int i = 0 ; i < cit.length ; i++){
            if(cit[i] >= (cit.length - i))
                return cit.length-i;
        }
        return 0;
    }
}

-------------------------------------------- Solution 2 --------------------------------------------------

class Solution {
    public int hIndex(int[] cit) {
        int n = cit.length;
        int count[] = new int[n+1];

        for(int c : cit)
            ++count[Math.min(c,n)];

        int sum = 0;

        for(int i = n; i >= 0 ; i--){
            sum += count[i];
            if(sum >= i)
                return i;
        }
        return 0;
    }
}
