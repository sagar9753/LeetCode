Ques Link - https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/

----------------------------------------- Solution -----------------------------------------------

class Solution {
    public List<List<Integer>> groupThePeople(int[] gs) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0 ; i < gs.length ; i++){
            if(mp.containsKey(gs[i]) && ans.get(mp.get(gs[i])).size() < gs[i])
                ans.get(mp.get(gs[i])).add(i);
            else{
                ans.add(new ArrayList(Arrays.asList(i)));
                mp.put(gs[i],ans.size()-1);
            }
        }
        return ans;
    }
}
