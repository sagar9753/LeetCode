Ques Link - https://leetcode.com/problems/find-players-with-zero-or-one-losses/

------------------------------------------- Solution --------------------------------------------------

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> cnt = new HashMap<>();
        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for(int m[] : matches){
            cnt.putIfAbsent(m[0], 0);
            cnt.put(m[1],cnt.getOrDefault(m[1],0)+1);
        }
        for(int plyr : cnt.keySet()){
            if(cnt.get(plyr) == 0)
                ans.get(0).add(plyr);
            if(cnt.get(plyr) == 1)
                ans.get(1).add(plyr);
        }
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }
}
